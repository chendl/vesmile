package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.dao.mybatis.example.UserRightExample;
import com.vesmile.webappla.model.UserRight;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserRightMapper {
    int countByExample(UserRightExample example);

    int deleteByExample(UserRightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    List<UserRight> selectByExample(UserRightExample example);

    UserRight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRight record, @Param("example") UserRightExample example);

    int updateByExample(@Param("record") UserRight record, @Param("example") UserRightExample example);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}