package com.zjw.blog.pdf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Created by 张计委
 * @Classname PublicController
 * @Date 2019-12-25 15:20
 * @Description TODO
 */
@Controller
public class PublicController {
    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("pdf/index");
        modelAndView.addObject("title", "CGX");
        return modelAndView;
    }
}
