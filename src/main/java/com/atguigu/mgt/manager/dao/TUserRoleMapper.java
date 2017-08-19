package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TRole;
import com.atguigu.mgt.manager.bean.TUserRole;
import com.atguigu.mgt.manager.bean.TUserRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    long countByExample(TUserRoleExample example);

    int deleteByExample(TUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

    List<TUserRole> selectByExample(TUserRoleExample example);

    TUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    int updateByExample(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    int updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);
    
    
}