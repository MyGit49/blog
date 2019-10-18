package com.zjw.blog.swagger_demo.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Created by 张计委
 * @Classname Base
 * @Date 2019-10-14 13:24
 * @Description TODO
 */
@ApiModel(description = "User内部对象")
public class Base {
    @ApiModelProperty(value = "baseId,比如：20")
    private int baseId;

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }
    //必须添加
    public Base() {
    }

    public Base(int baseId) {
        this.baseId = baseId;
    }
}
