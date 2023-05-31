package main.java.mapper;

import main.java.bean.Medecine;
import main.java.bean.MedecineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedecineMapper {
    int countByExample(MedecineExample example);

    int deleteByExample(MedecineExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Medecine record);

    int insertSelective(Medecine record);

    List<Medecine> selectByExample(MedecineExample example);

    Medecine selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") Medecine record, @Param("example") MedecineExample example);

    int updateByExample(@Param("record") Medecine record, @Param("example") MedecineExample example);

    int updateByPrimaryKeySelective(Medecine record);

    int updateByPrimaryKey(Medecine record);
}