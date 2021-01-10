package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.CourseMapper;
import com.example.studentmanagementserver.dao.TeacherMapper;
import com.example.studentmanagementserver.pojo.Teacher;
import com.example.studentmanagementserver.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }

    @Override
    public Teacher insert(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
