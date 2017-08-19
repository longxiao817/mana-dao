package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TUserTicket;
import com.atguigu.mgt.manager.bean.TUserTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserTicketMapper {
    long countByExample(TUserTicketExample example);

    int deleteByExample(TUserTicketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserTicket record);

    int insertSelective(TUserTicket record);

    List<TUserTicket> selectByExample(TUserTicketExample example);

    TUserTicket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserTicket record, @Param("example") TUserTicketExample example);

    int updateByExample(@Param("record") TUserTicket record, @Param("example") TUserTicketExample example);

    int updateByPrimaryKeySelective(TUserTicket record);

    int updateByPrimaryKey(TUserTicket record);
}