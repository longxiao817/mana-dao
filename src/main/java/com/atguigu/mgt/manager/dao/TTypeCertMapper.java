package com.atguigu.mgt.manager.dao;

import com.atguigu.mgt.manager.bean.TTypeCert;
import com.atguigu.mgt.manager.bean.TTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTypeCertMapper {
    long countByExample(TTypeCertExample example);

    int deleteByExample(TTypeCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTypeCert record);

    int insertSelective(TTypeCert record);

    List<TTypeCert> selectByExample(TTypeCertExample example);

    TTypeCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTypeCert record, @Param("example") TTypeCertExample example);

    int updateByExample(@Param("record") TTypeCert record, @Param("example") TTypeCertExample example);

    int updateByPrimaryKeySelective(TTypeCert record);

    int updateByPrimaryKey(TTypeCert record);
}