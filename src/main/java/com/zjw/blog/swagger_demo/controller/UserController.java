package com.zjw.blog.swagger_demo.controller;

import com.zjw.blog.swagger_demo.dao.Base;
import com.zjw.blog.swagger_demo.dao.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Created by 张计委
 * @Classname UserController
 * @Date 2019-10-14 13:28
 * @Description TODO
 */
@Api(value = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "获取用户列表",notes = "根据url的id来获取用户详细信息，返回List<User>类型用户信息的json;")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query",dataType = "string")
    })
    @GetMapping("one")
    public List<User> getUserBagOne(String id) {
        List<User> users = new ArrayList<>();
        try {
            if (id.equals("1")) {
                User user = new User();
                user.setName("zhangjw");
                user.setId("1");
                user.setAge(21);
                user.setBase(new Base(1));
                users.add(user);
            } else {
                User user = new User();
                user.setName("wangtg");
                user.setId("2");
                user.setAge(21);
                user.setBase(new Base(2));
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            return users;
        }

    }
}
