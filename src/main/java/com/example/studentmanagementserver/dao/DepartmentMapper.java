package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.Department;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> findAll();

    Long getDepartmentIdByName(@Param("name") String name);
}