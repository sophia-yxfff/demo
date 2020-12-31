package com.example.demo.controller;

import com.example.demo.service.myservice;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    @Autowired
    myservice serv;
    @RequestMapping("/getAllUser")
    @ResponseBody
    private List<User> getAllUser() {
        List<User> users =  serv.getAllUser();

        return users;
    }
}
