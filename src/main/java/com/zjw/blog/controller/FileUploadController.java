package com.zjw.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Created by 张计委
 * @Classname FileUploadController
 * @Date 2019-10-18 14:10
 * @Description TODO
 */
@Api(value = "多媒体文件上传")
@Controller
@RequestMapping("/fileUpload")
public class FileUploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${fileUpload.uploadPath}")
    private String uploadPath;

    @ApiOperation(value = "文件上传",notes = "进入上传文件主界面")
    @GetMapping
    public String fileUpload(){
        LOGGER.info("进入文件上传页面");
        return "fileUpload/fileUpload";
    }

    @ApiOperation(value = "单文件上传",notes = "执行单个多媒体文件上传功能")
    @ApiImplicitParam(name = "file",value = "待上传文件",dataType = "MultipartFile")
    @PostMapping("/fileUploadSingle")
    @ResponseBody
    public Object fileUploadSingle(@RequestParam("file")MultipartFile file){
        try {
            file.transferTo(new File(uploadPath+file.getOriginalFilename()));
            LOGGER.info("文件保存路径："+uploadPath+file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    @ApiOperation(value = "多文件上传",notes = "执行多个多媒体文件上传功能")
    @ApiImplicitParam(name = "file",value = "待上传文件",dataType = "MultipartFile")
    @PostMapping("/fileUploadMultiple")
    @ResponseBody
    public Object fileUploadMultiple(@RequestParam("file") MultipartFile[] files){
        try {
            if (files == null||files.length == 0){
                return "error";
            }
            for (MultipartFile file : files){
                file.transferTo(new File(uploadPath+file.getOriginalFilename()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }
}
