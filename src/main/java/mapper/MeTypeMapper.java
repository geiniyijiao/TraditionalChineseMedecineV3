package main.java.mapper;

import main.java.bean.MeType;
import main.java.bean.MeTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeTypeMapper {
    int countByExample(MeTypeExample example);

    int deleteByExample(MeTypeExample example);

    int deleteByPrimaryKey(Integer mTypeId);

    int insert(MeType record);

    int insertSelective(MeType record);

    List<MeType> selectByExample(MeTypeExample example);

    MeType selectByPrimaryKey(Integer mTypeId);

    int updateByExampleSelective(@Param("record") MeType record, @Param("example") MeTypeExample example);

    int updateByExample(@Param("record") MeType record, @Param("example") MeTypeExample example);

    int updateByPrimaryKeySelective(MeType record);

    int updateByPrimaryKey(MeType record);
}