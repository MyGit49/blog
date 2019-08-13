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
    /**
     *功能描述
     * @author zjw
     * @date 2019/8/13
     * @param [userAccount]
     * @return com.zjw.blog.entity.User
     */
    public User findByUserAccount(String userAccount){
        return userRepository.findUserByUserAccount(userAccount);
    }

    /**
     *功能描述
     * @author zjw
     * @date 2019/8/13
     * @param [user]
     * @return void
     */
    public void updateUser(User user){
        User user1 = userRepository.findUserById(user.getId());
        user1.setUserAccount(user.getUserAccount());
        user1.setUserName(user.getUserName());
        user1.setUserPassword(user.getUserPassword());
        userRepository.save(user1);
    }
}
