package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.CourseMapper;
import com.example.studentmanagementserver.pojo.Course;
import com.example.studentmanagementserver.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public Course insert(Course course) {
        return null;
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
