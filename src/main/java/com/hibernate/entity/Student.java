package com.hibernate.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by pravin on 2/10/2017.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String student_name;
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "student_id")
    private List<StudentAddress> studentAddress;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<StudentAddress> getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(List<StudentAddress> studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(String student_name, List<StudentAddress> studentAddress) {
        this.student_name = student_name;
        this.studentAddress = studentAddress;
    }

    public Student(List<StudentAddress> studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student() {
    }
}

