package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.model.UserPriv;
import com.vesmile.webappla.model.UserPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPrivMapper {
    int countByExample(UserPrivExample example);

    int deleteByExample(UserPrivExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPriv record);

    int insertSelective(UserPriv record);

    List<UserPriv> selectByExample(UserPrivExample example);

    UserPriv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPriv record, @Param("example") UserPrivExample example);

    int updateByExample(@Param("record") UserPriv record, @Param("example") UserPrivExample example);

    int updateByPrimaryKeySelective(UserPriv record);

    int updateByPrimaryKey(UserPriv record);
}