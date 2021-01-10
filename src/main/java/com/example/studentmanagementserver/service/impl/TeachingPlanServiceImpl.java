package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.CourseMapper;
import com.example.studentmanagementserver.dao.DepartmentMapper;
import com.example.studentmanagementserver.dao.TeacherMapper;
import com.example.studentmanagementserver.dao.TeachingPlanMapper;
import com.example.studentmanagementserver.pojo.TeachingPlan;
import com.example.studentmanagementserver.service.TeachingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingPlanServiceImpl implements TeachingPlanService {
    @Autowired
    private TeachingPlanMapper teachingPlanMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<TeachingPlan> findAll() {
        return teachingPlanMapper.findAll();
    }

    @Override
    public void insert(TeachingPlan teachingPlan) {
       teachingPlanMapper.insert(teachingPlan);
    }

    @Override
    public void update(TeachingPlan teachingPlan) {
        long departmentId = departmentMapper.getDepartmentIdByName(teachingPlan.getDepartmentName());
        teachingPlan.setDepartmentId(Math.toIntExact(departmentId));
        long courseId = courseMapper.getCourseIdByName(teachingPlan.getCourseName());
        teachingPlan.setCourseId(Math.toIntExact(courseId));
        long teacherId = teacherMapper.getTeacherIdByName(teachingPlan.getTeacherName());
        teachingPlan.setTeacherId(Math.toIntExact(teacherId));
        teachingPlanMapper.updateByPrimaryKeySelective(teachingPlan);
    }

    @Override
    public void delete(Long id) {
        teachingPlanMapper.deleteByPrimaryKey(Math.toIntExact(id));
    }
}
