package com.zjw.blog.controller;

import com.zjw.blog.entity.User;
import com.zjw.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/test")
    public User test(){
        List<User> userList = userRepository.findAll();
        System.out.println(userList.size());
        System.out.println("hello world");
        return userList.get(0);
    }
}
