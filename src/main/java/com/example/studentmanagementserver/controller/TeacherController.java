package com.example.studentmanagementserver.controller;

import com.example.studentmanagementserver.common.ServerResponse;
import com.example.studentmanagementserver.pojo.Teacher;
import com.example.studentmanagementserver.service.TeacherService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/item")
    public ServerResponse<Teacher> createDept(@RequestBody Teacher teacher) {
        teacherService.insert(teacher);
        return ServerResponse.createBySuccess();
    }

    @DeleteMapping("/item")
    public ServerResponse<Teacher> deleteDept(@Param("id") Long id) {
        teacherService.delete(id);
        return ServerResponse.createBySuccess();
    }

    @PutMapping("/item")
    public ServerResponse<Object> updateDept(@RequestBody Teacher teacher) {
        return ServerResponse.createBySuccess(teacherService.update(teacher));
    }

    @GetMapping("/list")
    public ServerResponse<List<Teacher>> findAll() {
        return ServerResponse.createBySuccess(teacherService.findAll());
    }
}
