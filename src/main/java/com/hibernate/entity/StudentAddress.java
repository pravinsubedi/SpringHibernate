package com.hibernate.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by pravin on 2/10/2017.
 */
@Entity
public class StudentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int add_id;
    private  String address;
//    @ManyToOne(cascade =CascadeType.ALL)
// //   @LazyCollection(LazyCollectionOption.FALSE)
//    @JoinColumn(name = "student_id")
//    Student student;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "add_id")
//    List<Student> students;


    public StudentAddress(String address) {
        this.address = address;
    }

    public int getStudent_id() {
        return add_id;
    }

    public void setStudent_id(int student_id) {
        this.add_id= student_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentAddress() {
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }


//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
}

