package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserComentar;
import com.atguigu.mgt.manager.bean.TUserComentarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserComentarMapper {
    long countByExample(TUserComentarExample example);

    int deleteByExample(TUserComentarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserComentar record);

    int insertSelective(TUserComentar record);

    List<TUserComentar> selectByExample(TUserComentarExample example);

    TUserComentar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserComentar record, @Param("example") TUserComentarExample example);

    int updateByExample(@Param("record") TUserComentar record, @Param("example") TUserComentarExample example);

    int updateByPrimaryKeySelective(TUserComentar record);

    int updateByPrimaryKey(TUserComentar record);
}