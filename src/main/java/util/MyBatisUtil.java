package main.java.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {

    private static final String RESOURCE = "Mybatis.xml";
    private static SqlSessionFactory factory = null;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    //初始化连接会话工厂
    static {
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(RESOURCE);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始Mybatis错误,请检测配置文件或数据库");
        }
    }

    public static SqlSessionFactory getSQLSessionFactory() {
        return factory;
    }

    //获取到session
    public static SqlSession getSession() {
        //session TL的get()方法根据当前线程返回其对应的线程内部变量
        //也就是我们需要的session,多线程情况下共享数据库连接是不安全
        //ThreadLocal保证了每个线程都有自己的session
        SqlSession session = threadLocal.get();
        //如果session为null,则打开一个新的session
        if (session == null) {
            session = factory != null ? factory.openSession() : null;
            threadLocal.set(session);
        }
        return session;
    }

    public static void closeSession() {
        SqlSession session = threadLocal.get();
        threadLocal.set(null);
        if (session != null)
            session.close();
    }
}
