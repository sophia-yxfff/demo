package com.example.demo.service.impl;
import com.example.demo.dao.mydao;
import com.example.demo.model.User;
import com.example.demo.service.myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class myServiceImpl implements myservice {
    @Autowired
    mydao dao;
    @Override
    public List<User> getAllUser() {
        return dao.findAllUser();
    }
}
