package com.example.studentmanagementserver.service;

import com.example.studentmanagementserver.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void insert(Student student);

    void deleteById(Long id);

    void update(Student student);
}
