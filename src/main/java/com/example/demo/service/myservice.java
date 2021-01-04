package com.example.demo.service;
import com.example.demo.model.User;
import java.util.List;

public interface myservice {
   public List<User> getUsers();
   public User findUserById(int id);
   public boolean updateUserById(User user);
   public boolean insertUser(User user);
   public boolean deleteById(int id);

}
