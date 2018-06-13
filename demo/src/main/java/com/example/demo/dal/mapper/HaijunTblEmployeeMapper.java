package com.example.demo.dal.mapper;

import com.example.demo.dal.model.HaijunTblEmployee;
import com.example.demo.dal.model.HaijunTblEmployeeExample;
import com.example.demo.dal.myMapper.MyMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HaijunTblEmployeeMapper extends MyMapper<HaijunTblEmployee> {
    long countByExample(HaijunTblEmployeeExample example);

    int deleteByExample(HaijunTblEmployeeExample example);

    List<HaijunTblEmployee> selectByExample(HaijunTblEmployeeExample example);

    int updateByExampleSelective(@Param("record") HaijunTblEmployee record, @Param("example") HaijunTblEmployeeExample example);

    int updateByExample(@Param("record") HaijunTblEmployee record, @Param("example") HaijunTblEmployeeExample example);
}