package com.example.studentmanagementserver.pojo;

import javax.persistence.*;

@Entity
public class Achievement {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  @Column
  private String studentId;
  @Column
  private long courseId;
  @Column
  private double score;

  public Achievement() {
    super();
  }

  public Achievement(long id, String studentId, long courseId, double score) {
    this.id = id;
    this.studentId = studentId;
    this.courseId = courseId;
    this.score = score;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }


  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

}
