package com.hibernate.entity;

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


}

