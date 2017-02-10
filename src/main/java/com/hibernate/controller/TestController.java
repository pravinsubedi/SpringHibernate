package com.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pravin on 2/10/2017.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = "text/html")
    @ResponseBody
    public String test(){
        return "test";
    }
}
