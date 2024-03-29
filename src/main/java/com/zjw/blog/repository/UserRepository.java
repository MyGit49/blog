package com.zjw.blog.repository;

import com.zjw.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther 张计委
 * @description
 * @date
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserAccount(String userAccount);
    User findUserById(Integer id);
}
