package com.example.studentmanagementserver.controller;

import com.example.studentmanagementserver.common.ServerResponse;
import com.example.studentmanagementserver.pojo.Department;
import com.example.studentmanagementserver.pojo.Student;
import com.example.studentmanagementserver.service.StudentService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping("/item")
    public ServerResponse<Department> createStudent(@RequestBody Student student) {
        studentService.insert(student);
        return ServerResponse.createBySuccess();
    }

    @DeleteMapping("/item")
    public ServerResponse<Department> deleteStudent(@Param("id") Long id) {
        studentService.deleteById(id);
        return ServerResponse.createBySuccess();
    }

    @PutMapping("/item")
    public ServerResponse<Object> updateStudent(@RequestBody Student student) {
        studentService.update(student);
        return ServerResponse.createBySuccess();
    }
}
