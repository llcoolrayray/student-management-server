package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.DepartmentMapper;
import com.example.studentmanagementserver.pojo.Department;
import com.example.studentmanagementserver.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    @Override
    public void insert(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public void update(Department department) {
        departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public void delete(Long id) {
        departmentMapper.deleteByPrimaryKey(Math.toIntExact(id));
    }
}
