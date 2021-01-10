package com.example.studentmanagementserver.pojo;

public class TeachingPlan {
    private Integer id;

    private String semester;

    private Integer teacherId;

    private Integer courseId;

    private Integer departmentId;

    private String courseName;

    private String departmentName;

    private String teacherName;

    private String remark;

    public TeachingPlan(Integer id, String semester, Integer teacherId, Integer courseId, Integer departmentId, String courseName, String departmentName, String teacherName) {
        this.id = id;
        this.semester = semester;
        this.teacherId = teacherId;
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.courseName = courseName;
        this.departmentName = departmentName;
        this.teacherName = teacherName;
    }

    public TeachingPlan(Integer id, String semester, Integer teacherId, Integer courseId, Integer departmentId, String courseName, String departmentName, String teacherName, String remark) {
        this.id = id;
        this.semester = semester;
        this.teacherId = teacherId;
        this.courseId = courseId;
        this.departmentId = departmentId;
        this.courseName = courseName;
        this.departmentName = departmentName;
        this.teacherName = teacherName;
        this.remark = remark;
    }

    public TeachingPlan() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}