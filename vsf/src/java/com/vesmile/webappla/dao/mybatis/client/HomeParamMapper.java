package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.dao.mybatis.example.HomeParamExample;
import com.vesmile.webappla.model.HomeParam;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HomeParamMapper {
    int countByExample(HomeParamExample example);

    int deleteByExample(HomeParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomeParam record);

    int insertSelective(HomeParam record);

    List<HomeParam> selectByExample(HomeParamExample example);

    HomeParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomeParam record, @Param("example") HomeParamExample example);

    int updateByExample(@Param("record") HomeParam record, @Param("example") HomeParamExample example);

    int updateByPrimaryKeySelective(HomeParam record);

    int updateByPrimaryKey(HomeParam record);
}