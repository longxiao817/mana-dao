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
    
    /**
     * 通过令牌及用户Id更新用户密码
     * @param passwd
     * @param token
     * @return
     */
    int updatePswdByToken(@Param("passwd")String passwd, @Param("token")String token);
    
    /**
     * 获取所有的fans
     * @param userId
     * @return
     */
    List<TUsers> getAllFansByUserId(@Param("userId")Integer userId);
    
    /**
     * 获取所有的关注
     * @param userId
     * @return
     */
    List<TUsers> getAllFocusByUserId(@Param("userId")Integer userId);
}