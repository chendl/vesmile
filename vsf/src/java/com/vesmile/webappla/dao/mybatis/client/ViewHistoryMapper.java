package com.vesmile.webappla.dao.mybatis.client;

import com.vesmile.webappla.model.ViewHistory;
import com.vesmile.webappla.model.ViewHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewHistoryMapper {
    int countByExample(ViewHistoryExample example);

    int deleteByExample(ViewHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ViewHistory record);

    int insertSelective(ViewHistory record);

    List<ViewHistory> selectByExample(ViewHistoryExample example);

    ViewHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ViewHistory record, @Param("example") ViewHistoryExample example);

    int updateByExample(@Param("record") ViewHistory record, @Param("example") ViewHistoryExample example);

    int updateByPrimaryKeySelective(ViewHistory record);

    int updateByPrimaryKey(ViewHistory record);
}