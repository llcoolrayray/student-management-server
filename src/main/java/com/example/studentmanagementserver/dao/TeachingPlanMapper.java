package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.TeachingPlan;

import java.util.List;

public interface TeachingPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingPlan record);

    int insertSelective(TeachingPlan record);

    TeachingPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeachingPlan record);

    int updateByPrimaryKeyWithBLOBs(TeachingPlan record);

    int updateByPrimaryKey(TeachingPlan record);

    List<TeachingPlan> findAll();
}