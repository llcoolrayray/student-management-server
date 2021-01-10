package com.example.studentmanagementserver.service;

import com.example.studentmanagementserver.pojo.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course insert(Course course);
    Course update(Course course);
    void delete(Long id);
}






