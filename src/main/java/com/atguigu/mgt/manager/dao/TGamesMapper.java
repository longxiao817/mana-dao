package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TGames;
import com.atguigu.mgt.manager.bean.TGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGamesMapper {
    long countByExample(TGamesExample example);

    int deleteByExample(TGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGames record);

    int insertSelective(TGames record);

    List<TGames> selectByExample(TGamesExample example);

    TGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGames record, @Param("example") TGamesExample example);

    int updateByExample(@Param("record") TGames record, @Param("example") TGamesExample example);

    int updateByPrimaryKeySelective(TGames record);

    int updateByPrimaryKey(TGames record);
    
    List<TGames> selectByTab(String tabs);
    
    TGames getGameByComentarId(Integer id);
    
    List<TGames> selectGameByUserId(Integer id);
}