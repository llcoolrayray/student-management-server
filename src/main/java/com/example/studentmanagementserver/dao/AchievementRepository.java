package com.example.studentmanagementserver.dao;

import com.example.studentmanagementserver.pojo.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Integer> {
    Achievement findById(int id);
}
