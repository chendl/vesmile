package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.dao.mybatis.example.PropertyExample;
import com.vesmile.webappla.model.Property;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PropertyMapper {
    int countByExample(PropertyExample example);

    int deleteByExample(PropertyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExampleWithBLOBs(PropertyExample example);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExampleWithBLOBs(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKeyWithBLOBs(Property record);

    int updateByPrimaryKey(Property record);
}