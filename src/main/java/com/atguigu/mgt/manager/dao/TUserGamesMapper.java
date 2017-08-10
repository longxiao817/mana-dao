package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserGames;
import com.atguigu.mgt.manager.bean.TUserGamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserGamesMapper {
    long countByExample(TUserGamesExample example);

    int deleteByExample(TUserGamesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserGames record);

    int insertSelective(TUserGames record);

    List<TUserGames> selectByExample(TUserGamesExample example);

    TUserGames selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserGames record, @Param("example") TUserGamesExample example);

    int updateByExample(@Param("record") TUserGames record, @Param("example") TUserGamesExample example);

    int updateByPrimaryKeySelective(TUserGames record);

    int updateByPrimaryKey(TUserGames record);
}