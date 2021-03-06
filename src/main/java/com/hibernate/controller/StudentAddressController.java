package com.hibernate.controller;

import com.hibernate.entity.Student;
import com.hibernate.entity.StudentAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.sql.SQLException;

/**
 * Created by pravin on 2/10/2017.
 */
@Controller
public class StudentAddressController {

    @Autowired
    SessionFactory sessionFactory;
    Session session;

    @Transactional
    @RequestMapping(value = "/studentaddress",method = RequestMethod.POST,consumes = "application/json",headers = "Content-Type=application/json")
    @ResponseBody
    public String addStudent(@RequestBody StudentAddress studentAddress) throws SQLException {
        session=sessionFactory.getCurrentSession();
        session.save(studentAddress);
        return "student address saved";
    }
}
