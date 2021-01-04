package com.example.demo.dao;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface mydao {
    public List<User> findAllUser();
    public User findUserById(int id);
    public boolean updateUserById(User user);
    public boolean insertUser(User user);
    public boolean deleteById(int id);
}
