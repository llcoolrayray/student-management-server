package com.example.studentmanagementserver.controller;

import com.example.studentmanagementserver.common.ServerResponse;
import com.example.studentmanagementserver.pojo.TeachingPlan;
import com.example.studentmanagementserver.service.TeachingPlanService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/teachingPlan")
public class TeachingPlanController {
    private final TeachingPlanService teachingPlanService;

    public TeachingPlanController(TeachingPlanService teachingPlanService) {
        this.teachingPlanService = teachingPlanService;
    }

    @PostMapping("/item")
    public ServerResponse<TeachingPlan> createTeachingPlant(@RequestBody TeachingPlan TeachingPlan) {
        teachingPlanService.insert(TeachingPlan);
        return ServerResponse.createBySuccess();
    }

    @DeleteMapping("/item")
    public ServerResponse<TeachingPlan> deleteTeachingPlant(@Param("id") Long id) {
        teachingPlanService.delete(id);
        return ServerResponse.createBySuccess();
    }

    @PutMapping("/item")
    public ServerResponse<Object> updateTeachingPlant(@RequestBody TeachingPlan TeachingPlan) {
        teachingPlanService.update(TeachingPlan);
        return ServerResponse.createBySuccess();
    }

    @GetMapping("/list")
    public ServerResponse<List<TeachingPlan>> findAll() {
        return ServerResponse.createBySuccess(teachingPlanService.findAll());
    }

    public static void main(String[] args) {
        System.out.println(123);
    }
}
