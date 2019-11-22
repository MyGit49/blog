package com.zjw.utils.DataMaskUtil;

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
        logger.info(DataMaskUtil.maskName(name));
        logger.info(DataMaskUtil.maskPhoneNum(phoneNum));
        logger.info(DataMaskUtil.maskIdCard(IdCard));
    }
}
