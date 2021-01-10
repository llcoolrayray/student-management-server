package com.example.studentmanagementserver.service.impl;

import com.example.studentmanagementserver.dao.DepartmentMapper;
import com.example.studentmanagementserver.dao.StudentMapper;
import com.example.studentmanagementserver.pojo.Student;
import com.example.studentmanagementserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void deleteById(Long id) {
        studentMapper.deleteByPrimaryKey(Math.toIntExact(id));
    }

    @Override
    public void update(Student student) {
        long id = departmentMapper.getDepartmentIdByName(student.getDepartmentName());
        student.setDepartmentId(Math.toIntExact(id));
        studentMapper.updateByPrimaryKeySelective(student);
    }
}
