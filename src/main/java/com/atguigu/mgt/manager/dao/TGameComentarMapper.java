package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TGameComentar;
import com.atguigu.mgt.manager.bean.TGameComentarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGameComentarMapper {
    long countByExample(TGameComentarExample example);

    int deleteByExample(TGameComentarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGameComentar record);

    int insertSelective(TGameComentar record);

    List<TGameComentar> selectByExample(TGameComentarExample example);

    TGameComentar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGameComentar record, @Param("example") TGameComentarExample example);

    int updateByExample(@Param("record") TGameComentar record, @Param("example") TGameComentarExample example);

    int updateByPrimaryKeySelective(TGameComentar record);

    int updateByPrimaryKey(TGameComentar record);
}