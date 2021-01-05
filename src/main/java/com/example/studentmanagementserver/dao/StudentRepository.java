package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.Achievement;
import com.example.studentmanagementserver.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
