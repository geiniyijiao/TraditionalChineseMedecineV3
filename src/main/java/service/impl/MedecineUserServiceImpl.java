package main.java.service.impl;

import main.java.bean.MedecineUser;
import main.java.mapper.MedecineUserMapper;
import main.java.service.MedecineUserService;
import main.java.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class MedecineUserServiceImpl implements MedecineUserService {

    @Override
    public MedecineUser findById(String username) {
        SqlSession session = MyBatisUtil.getSession();
        MedecineUserMapper medecineUserMapper = session.getMapper(MedecineUserMapper.class);
        return medecineUserMapper.selectByPrimaryKey(username);
    }

    @Override
    public int userRegister(MedecineUser medecineUser) {
        SqlSession session = MyBatisUtil.getSession();
        MedecineUserMapper medecineUserMapper = session.getMapper(MedecineUserMapper.class);
        int flag = medecineUserMapper.insert(medecineUser);
        session.commit();
        return flag;
    }
}
