package main.java.servlet;

import main.java.bean.MedecineUser;
import main.java.service.MedecineUserService;
import main.java.service.impl.MedecineUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = {"/userLogin.do", "/userLogout.do", "/userRegister.do"})
public class MedecineUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    MedecineUserService mus = new MedecineUserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/") + 1, path.indexOf(".do"));
        if (path.equals("userLogin")) {
            String username, password;
            MedecineUser mu = new MedecineUser();
            username = req.getParameter("username");
            password = req.getParameter("password");
            //通过用户名查找数据库内的用户
            mu = mus.findById(username);
            //判断用户名
            if (mu != null && mu.getPassword().equals(password)) {
                //保存用户到session
                HttpSession session = req.getSession();
                session.setAttribute("user", mu);
                req.getRequestDispatcher("/index.jsp").forward(req, resp);
            }
            else {
                req.setAttribute("error", "用户名或密码错误");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }

        }
        else if (path.equals("userLogout")){
            // 登录后session中保存了user
            //获取到session
            HttpSession session = req.getSession();
            //注销session
            session.invalidate();
            //重新回到主页
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        else if (path.equals("userRegister")){
            String username, password;
            int flag=0;
            username = req.getParameter("username");
            password = req.getParameter("password");
            if (mus.findById(username) == null){
                MedecineUser newmu = new MedecineUser();
                newmu.setUsername(username);
                newmu.setPassword(password);
                flag = mus.userRegister(newmu);
                if (flag==0){
                    req.setAttribute("error", "注册失败，请联系管理员！");
                }
                else {
                    req.setAttribute("user", newmu);
                    req.setAttribute("acc", "acc");
                }
            }
            else {
                req.setAttribute("error", "注册失败，用户名已存在，请重新输入！");
            }
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
