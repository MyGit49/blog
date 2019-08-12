package com.zjw.blog.controller;

import com.zjw.blog.entity.User;
import com.zjw.blog.repository.UserRepository;
import com.zjw.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public List<User> test(){
        List<User> userList = userRepository.findAll();
        System.out.println(userList.size());
        System.out.println("hello world");
        return userList;
    }

    @GetMapping("/t")
    public String t(){
        User user = userService.findByUserAccount("wangyh");
        return user.getUserName();
    }
}
