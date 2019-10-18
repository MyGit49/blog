package com.zjw.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Created by 张计委
 * @Classname UEditorController
 * @Date 2019/8/22 9:20
 * @Description TODO
 */
@Controller
@RequestMapping("admin")
public class UEditorController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String show(){
        return "admin/test";
    }
}
