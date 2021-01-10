package com.example.studentmanagementserver.service;

import com.example.studentmanagementserver.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();
    Teacher insert(Teacher teacher);
    Teacher update(Teacher teacher);
    void delete(Long id);
}
