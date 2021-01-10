package com.example.studentmanagementserver.pojo;

public class Student {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private Integer departmentId;

    private String departmentName;

    public Student(Integer id, String name, String sex, Integer age, Integer departmentId, String departmentName) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}