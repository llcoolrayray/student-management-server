package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.Teacher;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> findAll();

    long getTeacherIdByName(@Param("teacherName") String teacherName);
}