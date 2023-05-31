package main.java.service.impl;

import main.java.bean.MeType;
import main.java.mapper.MeTypeMapper;
import main.java.service.MedecineTypeService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MedecineTypeServiceImpl implements MedecineTypeService {

    @Override
    public List<MeType> findAll() {
        SqlSession session = main.java.util.MyBatisUtil.getSession();
        MeTypeMapper MeTypeMapper = session.getMapper(main.java.mapper.MeTypeMapper.class);
        return MeTypeMapper.selectByExample(null);
    }

    @Override
    public MeType findById(int mTypeId) {
        SqlSession session = main.java.util.MyBatisUtil.getSession();
        MeTypeMapper MeTypeMapper = session.getMapper(main.java.mapper.MeTypeMapper.class);
        return MeTypeMapper.selectByPrimaryKey(mTypeId);
    }
}
