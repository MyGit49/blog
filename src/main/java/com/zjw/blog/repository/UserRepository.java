package com.zjw.blog.repository;

import com.zjw.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther 张计委
 * @description
 * @date
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUserAccount(String userAccount);
}
