package com.zjw.blog.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JPA配置
 */
@Configuration//配置类注解
@EntityScan("com.zjw.blog.entity")//实体类扫描路径
@EnableJpaRepositories("com.zjw.blog.repository")//接口仓库地址
public class JPAConfig {
}
