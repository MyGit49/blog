package com.zjw.blog.utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Created by 张计委
 * @Classname DateUtil
 * @Date 2019-11-04 11:09
 * @Description TODO
 */
public class DateUtil {

    /**
     * 仅显示时分秒，例如 09:51:53.
     */
    public static final String TIME_FORMAT = "HH:mm:ss";
    /**
     * 仅显示年月日，例如 2015-08-11.
     */
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    /**
     * 显示年月日时分秒，例如 2015-08-11 09:51:53.
     */
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";


    /**
     * @description
     * @author 张计委
     * @date 2019-11-04 11:11
     * @return java.lang.String
     */
    public static String getDateTimeString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
