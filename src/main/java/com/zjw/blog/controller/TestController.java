package com.zjw.blog.controller;

import com.zjw.blog.entity.User;
import com.zjw.blog.repository.UserRepository;
import com.zjw.blog.service.UserService;
import com.zjw.utils.ExcelUtil.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Test")
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

    @PostMapping("/s")
    public String s(@RequestBody User user){
        try {
            userService.updateUser(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * Excel表格导出接口
     * http://localhost:15000/blog/Test/ExcelDownload
     * @param response response对象
     * @throws IOException 抛IO异常
     */
    @RequestMapping("/ExcelDownload")
    public void excelDownload(HttpServletResponse response) throws IOException {

        List<List<String>> excelData = new ArrayList<>();

        List<String> head = new ArrayList<>();
        head.add("第一列");
        head.add("第二列");
        head.add("第三列");

        List<String> data1 = new ArrayList<>();
        data1.add("123");
        data1.add("234");
        data1.add("345");

        List<String> data2 = new ArrayList<>();
        data2.add("abc");
        data2.add("bcd");
        data2.add("cde");

        excelData.add(head);
        excelData.add(data1);
        excelData.add(data2);

        String sheetName = "测试";
        String fileName = "ExcelTest.xls";

        ExcelUtil.exportExcel(response, excelData, sheetName, fileName, 15);
    }
}
