package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TTab;
import com.atguigu.mgt.manager.bean.TTabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTabMapper {
    long countByExample(TTabExample example);

    int deleteByExample(TTabExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTab record);

    int insertSelective(TTab record);

    List<TTab> selectByExample(TTabExample example);

    TTab selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTab record, @Param("example") TTabExample example);

    int updateByExample(@Param("record") TTab record, @Param("example") TTabExample example);

    int updateByPrimaryKeySelective(TTab record);

    int updateByPrimaryKey(TTab record);
}