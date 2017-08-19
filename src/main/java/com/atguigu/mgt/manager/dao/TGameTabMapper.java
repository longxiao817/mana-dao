package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TGameTab;
import com.atguigu.mgt.manager.bean.TGameTabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGameTabMapper {
    long countByExample(TGameTabExample example);

    int deleteByExample(TGameTabExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGameTab record);

    int insertSelective(TGameTab record);

    List<TGameTab> selectByExample(TGameTabExample example);

    TGameTab selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGameTab record, @Param("example") TGameTabExample example);

    int updateByExample(@Param("record") TGameTab record, @Param("example") TGameTabExample example);

    int updateByPrimaryKeySelective(TGameTab record);

    int updateByPrimaryKey(TGameTab record);
}