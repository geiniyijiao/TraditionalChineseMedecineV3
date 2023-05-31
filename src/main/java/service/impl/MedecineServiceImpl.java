package main.java.service.impl;

import main.java.bean.Medecine;
import main.java.bean.MedecineExample;
import main.java.mapper.MedecineMapper;
import main.java.service.MedecineService;
import main.java.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MedecineServiceImpl implements MedecineService {

    @Override
    public List<Medecine> findAll() {
        SqlSession session = MyBatisUtil.getSession();
        MedecineMapper MedecineMapper = session.getMapper(MedecineMapper.class);
        return MedecineMapper.selectByExample(null);
    }

    @Override
    public Medecine findById(int mId) {
        SqlSession session = MyBatisUtil.getSession();
        MedecineMapper MedecineMapper = session.getMapper(MedecineMapper.class);
        return MedecineMapper.selectByPrimaryKey(mId);
    }

    @Override
    public List<Medecine> findByName(String mName) {
        SqlSession session = MyBatisUtil.getSession();
        MedecineMapper MedecineMapper = session.getMapper(MedecineMapper.class);
        MedecineExample meex = new MedecineExample();
        MedecineExample.Criteria cri = meex.createCriteria();
        cri.andMNameEqualTo(mName);
        return MedecineMapper.selectByExample(meex);
    }

    @Override
    public List<Medecine> findByTypeId(int mTypeId) {
        SqlSession session = MyBatisUtil.getSession();
        MedecineMapper MedecineMapper = session.getMapper(MedecineMapper.class);
        MedecineExample meex = new MedecineExample();
        MedecineExample.Criteria cri = meex.createCriteria();
        cri.andMTypeIdEqualTo(mTypeId);
        return MedecineMapper.selectByExample(meex);
    }


}
