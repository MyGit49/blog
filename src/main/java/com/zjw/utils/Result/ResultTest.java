package com.zjw.utils.Result;

import java.util.HashMap;

/**
 * @Created by 张计委
 * @Classname ResultTest
 * @Date 2019-11-18 19:33
 * @Description TODO
 */
public class ResultTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("error","error");
        hashMap.put("success","success");
        CodeMsg codeMsg = new CodeMsg(345,"ok");
        Result result = Result.init(hashMap,codeMsg);
        Result result1 = Result.success(hashMap);
        Result result2 = Result.success();
        Result result3 = Result.error(CodeMsg.SUCCESS,"rfedhpguhpoi");
        Result result4 = Result.error(CodeMsg.NOT_FIND_DATA);
        System.out.println("0000");
    }
}
