package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.StudentRepository;
import com.example.studentmanagementserver.pojo.Student;
import com.example.studentmanagementserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
