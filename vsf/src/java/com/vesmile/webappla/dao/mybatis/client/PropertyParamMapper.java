package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.model.PropertyParam;
import com.vesmile.webappla.model.PropertyParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyParamMapper {
    int countByExample(PropertyParamExample example);

    int deleteByExample(PropertyParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropertyParam record);

    int insertSelective(PropertyParam record);

    List<PropertyParam> selectByExample(PropertyParamExample example);

    PropertyParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropertyParam record, @Param("example") PropertyParamExample example);

    int updateByExample(@Param("record") PropertyParam record, @Param("example") PropertyParamExample example);

    int updateByPrimaryKeySelective(PropertyParam record);

    int updateByPrimaryKey(PropertyParam record);
}