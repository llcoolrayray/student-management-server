package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.Course;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> findAll();

    long getCourseIdByName(@Param("name") String courseName);
}