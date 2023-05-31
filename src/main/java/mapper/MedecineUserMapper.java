package main.java.mapper;

import main.java.bean.MedecineUser;
import main.java.bean.MedecineUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedecineUserMapper {
    int countByExample(MedecineUserExample example);

    int deleteByExample(MedecineUserExample example);

    int deleteByPrimaryKey(String username);

    int insert(MedecineUser record);

    int insertSelective(MedecineUser record);

    List<MedecineUser> selectByExample(MedecineUserExample example);

    MedecineUser selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") MedecineUser record, @Param("example") MedecineUserExample example);

    int updateByExample(@Param("record") MedecineUser record, @Param("example") MedecineUserExample example);

    int updateByPrimaryKeySelective(MedecineUser record);

    int updateByPrimaryKey(MedecineUser record);
}