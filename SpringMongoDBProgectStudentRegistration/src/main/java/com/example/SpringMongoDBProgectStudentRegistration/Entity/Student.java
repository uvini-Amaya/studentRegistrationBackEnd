package com.example.SpringMongoDBProgectStudentRegistration.Entity;

import jakarta.persistence.Id;

import java.lang.annotation.Documented;

@Document(collection="students")
public class Student {
    @Id
    private String stu_id;
    private String stu_name;
    private String stu_address ;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", stu_address='" + stu_address + '\'' +
                ", stu_mobile='" + stu_mobile + '\'' +
                '}';
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public void setStu_mobile(String stu_mobile) {
        this.stu_mobile = stu_mobile;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_address() {
        return stu_address;
    }

    public String getStu_mobile() {
        return stu_mobile;
    }

    private String stu_mobile;


}
