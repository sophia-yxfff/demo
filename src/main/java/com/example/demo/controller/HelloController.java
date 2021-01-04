package com.example.demo.controller;
import javax.servlet.http.HttpServletRequest;
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
    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUsers(){
        return serv.getUsers();
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        serv.insertUser(user);
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public void updateUser(HttpServletRequest request) {
        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        User user = new User();
        user.setName(name);
        user.setId(id);
        user.setAge(age);
        user.setEmail(email);
        serv.updateUserById(user);
    }

    @RequestMapping("/getUserOne")
    @ResponseBody
    public User getUserOne(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        return serv.findUserById(id);
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public void deleteUser(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        serv.deleteById(id);
    }
}
