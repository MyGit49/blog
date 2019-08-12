package com.zjw.blog.service;

import com.zjw.blog.entity.User;
import com.zjw.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther 张计委
 * @description
 * @date
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUserAccount(String userAccount){
        return userRepository.findByUserAccount(userAccount);
    }
}
