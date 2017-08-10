package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserType;
import com.atguigu.mgt.manager.bean.TUserTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserTypeMapper {
    long countByExample(TUserTypeExample example);

    int deleteByExample(TUserTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserType record);

    int insertSelective(TUserType record);

    List<TUserType> selectByExample(TUserTypeExample example);

    TUserType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserType record, @Param("example") TUserTypeExample example);

    int updateByExample(@Param("record") TUserType record, @Param("example") TUserTypeExample example);

    int updateByPrimaryKeySelective(TUserType record);

    int updateByPrimaryKey(TUserType record);
}