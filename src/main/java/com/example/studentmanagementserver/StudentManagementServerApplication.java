package com.example.studentmanagementserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.studentmanagementserver.dao")
public class StudentManagementServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementServerApplication.class, args);
    }
}
