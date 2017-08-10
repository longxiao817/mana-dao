package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserFocus;
import com.atguigu.mgt.manager.bean.TUserFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserFocusMapper {
    long countByExample(TUserFocusExample example);

    int deleteByExample(TUserFocusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserFocus record);

    int insertSelective(TUserFocus record);

    List<TUserFocus> selectByExample(TUserFocusExample example);

    TUserFocus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserFocus record, @Param("example") TUserFocusExample example);

    int updateByExample(@Param("record") TUserFocus record, @Param("example") TUserFocusExample example);

    int updateByPrimaryKeySelective(TUserFocus record);

    int updateByPrimaryKey(TUserFocus record);
}