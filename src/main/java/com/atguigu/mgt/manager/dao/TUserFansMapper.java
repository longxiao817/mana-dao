package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserFans;
import com.atguigu.mgt.manager.bean.TUserFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserFansMapper {
    long countByExample(TUserFansExample example);

    int deleteByExample(TUserFansExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserFans record);

    int insertSelective(TUserFans record);

    List<TUserFans> selectByExample(TUserFansExample example);

    TUserFans selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserFans record, @Param("example") TUserFansExample example);

    int updateByExample(@Param("record") TUserFans record, @Param("example") TUserFansExample example);

    int updateByPrimaryKeySelective(TUserFans record);

    int updateByPrimaryKey(TUserFans record);
}