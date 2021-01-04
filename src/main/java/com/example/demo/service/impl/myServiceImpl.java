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
    public List<User> getUsers() {

        return dao.findAllUser();
    }

    @Override
    public User findUserById(int id) {
        return dao.findUserById(id);
    }
    @Override
    public boolean updateUserById(User user) {
        dao.updateUserById(user);
        return true;
    }
    @Override
    public boolean insertUser(User user){
        dao.insertUser(user);
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        dao.deleteById(id);
        return true;
    }
}
