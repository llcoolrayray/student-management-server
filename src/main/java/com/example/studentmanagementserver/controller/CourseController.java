package com.example.studentmanagementserver.controller;

import com.example.studentmanagementserver.common.ServerResponse;
import com.example.studentmanagementserver.pojo.Course;
import com.example.studentmanagementserver.service.CourseService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/item")
    public ServerResponse<Course> createDept(@RequestBody Course course) {
        return ServerResponse.createBySuccess(courseService.insert(course));
    }

    @DeleteMapping("/item")
    public ServerResponse<Course> deleteDept(@Param("id") Long id) {
        courseService.delete(id);
        return ServerResponse.createBySuccess();
    }

    @PutMapping("/item")
    public ServerResponse<Object> updateDept(@RequestBody Course course) {
        return ServerResponse.createBySuccess(courseService.update(course));
    }

    @GetMapping("/list")
    public ServerResponse<List<Course>> findAll() {
        return ServerResponse.createBySuccess(courseService.findAll());
    }
}
