package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUsers;
import com.atguigu.mgt.manager.bean.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersMapper {
    long countByExample(TUsersExample example);

    int deleteByExample(TUsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    List<TUsers> selectByExample(TUsersExample example);

    TUsers selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);
}