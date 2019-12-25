package com.zjw.blog.utils.DataMaskUtil;


import org.thymeleaf.util.StringUtils;

/**
 * @Created by 张计委
 * @Classname DataMaskUtil
 * @Date 2019-11-22 16:38
 * @Description TODO
 */
public class DataMaskUtil {

    /**
     * 【中文姓名】只显示第一个汉字，其他隐藏为2个星号，比如：李**
     */
    public static String maskName(String name){
        if (StringUtils.isEmpty(name)){
            return "";
        }
        String returnStr = StringUtils.substring(name,0,1)+"**";
        return returnStr;
    }

    /**
     * 【身份证号】显示前六位和最后四位，其他隐藏。共计18位，比如：130981********601X
     */
    public static String maskIdCard(String IdCard){
        if (StringUtils.isEmpty(IdCard)){
            return "";
        }
        String returnStr = StringUtils.substring(IdCard,0,6)+"********"+StringUtils.substring(IdCard,IdCard.length()-4);
        return returnStr;
    }

    /**
     * 【手机号码】前三位，后四位，其他隐藏，比如：135****6810
     */
    public static String maskPhoneNum(String phoneNum){
        if (StringUtils.isEmpty(phoneNum)){
            return "";
        }
        String returnStr = StringUtils.substring(phoneNum,0,3)+"****"+StringUtils.substring(phoneNum,phoneNum.length()-4);
        return returnStr;
    }
}
