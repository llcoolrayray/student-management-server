package com.example.studentmanagementserver.controller;

import com.example.studentmanagementserver.common.ServerResponse;
import com.example.studentmanagementserver.pojo.Department;
import com.example.studentmanagementserver.service.DepartmentService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/item")
    public ServerResponse<Department> createDept(@RequestBody Department department) {
        departmentService.insert(department);
        return ServerResponse.createBySuccess();
    }

    @DeleteMapping("/item")
    public ServerResponse<Department> deleteDept(@Param("id") Long id) {
        departmentService.delete(id);
        return ServerResponse.createBySuccess();
    }

    @PutMapping("/item")
    public ServerResponse<Object> updateDept(@RequestBody Department department) {
        departmentService.update(department);
        return ServerResponse.createBySuccess();
    }

    @GetMapping("/list")
    public ServerResponse<List<Department>> findAll() {
        return ServerResponse.createBySuccess(departmentService.findAll());
    }
}
