package com.zjw.blog.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Created by 张计委
 * @Classname LoginController
 * @Date 2019-12-25 17:18
 * @Description TODO
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/visitLogin")
    public ModelAndView visitLogin(ModelAndView modelAndView){
        modelAndView.setViewName("login/login");
        modelAndView.addObject("loginName","zhangjw");
        return modelAndView;
    }
}
