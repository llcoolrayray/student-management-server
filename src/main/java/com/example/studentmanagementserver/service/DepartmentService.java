package com.example.studentmanagementserver.service;

import com.example.studentmanagementserver.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    void insert(Department department);
    void update(Department department);
    void delete(Long id);
}
