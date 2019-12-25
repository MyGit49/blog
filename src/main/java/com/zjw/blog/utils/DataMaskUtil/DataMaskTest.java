package com.zjw.blog.utils.DataMaskUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Created by 张计委
 * @Classname DataMaskTest
 * @Date 2019-11-22 16:51
 * @Description TODO
 */
public class DataMaskTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DataMaskTest.class);
        String name = "张计委";
        String phoneNum = "18712793601";
        String IdCard = "13098119970511601X";
        logger.info("姓名[{}]",DataMaskUtil.maskName(name));
        logger.info("手机号[{}]",DataMaskUtil.maskPhoneNum(phoneNum));
        logger.info("身份证号[{}]",DataMaskUtil.maskIdCard(IdCard));
    }
}
