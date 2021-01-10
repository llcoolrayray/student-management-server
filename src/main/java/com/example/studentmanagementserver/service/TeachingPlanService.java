package com.example.studentmanagementserver.service;

import com.example.studentmanagementserver.pojo.TeachingPlan;

import java.util.List;

public interface TeachingPlanService {
    List<TeachingPlan> findAll();
    void insert(TeachingPlan teachingPlan);
    void update(TeachingPlan teachingPlan);
    void delete(Long id);
}
