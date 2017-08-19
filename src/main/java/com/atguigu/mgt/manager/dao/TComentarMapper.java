package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TComentar;
import com.atguigu.mgt.manager.bean.TComentarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComentarMapper {
    long countByExample(TComentarExample example);

    int deleteByExample(TComentarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TComentar record);

    int insertSelective(TComentar record);

    List<TComentar> selectByExample(TComentarExample example);

    TComentar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TComentar record, @Param("example") TComentarExample example);

    int updateByExample(@Param("record") TComentar record, @Param("example") TComentarExample example);

    int updateByPrimaryKeySelective(TComentar record);

    int updateByPrimaryKey(TComentar record);
    
    List<TComentar> getGameComentar(@Param("gameId")Integer gameId);
}