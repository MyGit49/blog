package com.zjw.blog.utils.MD5Util;

import java.security.MessageDigest;

/**
 * @Created by 张计委
 * @Classname MD5Util
 * @Date 2019/8/20 14:58
 * @Description TODO
 */
public class MD5Util {
    private static final String[] hexDigIts1 = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    private static final char[] hexDigits2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    /**
     * @description MD5加密
     * @author 张计委
     * @date 2019/8/20 15:28
     * @param origin
     * @param charsetname
     * @return java.lang.String
     */
    public static String MD5Encode(String origin, String charsetname){
        String resultString = null;
        try{
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if(null == charsetname || "".equals(charsetname)){
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            }else{
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        }catch (Exception e){
        }
        return resultString;
    }


    public static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for(int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigIts1[d1] + hexDigIts1[d2];
    }

    /**
     * @description MD5加密
     * @author 张计委
     * @date 2019/8/20 15:17
     * @param str
     * @return java.lang.String
     */
    public final static String MD5(String str) {
        try {
            byte[] strTemp = str.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] tmp = mdTemp.digest(); // MD5 的计算结果是一个 128 位的长整数，
            // 用字节表示就是 16 个字节
            char[] strs = new char[16 * 2]; // 每个字节用 16 进制表示的话，使用两个字符，
            // 所以表示成 16 进制需要 32 个字符
            int k = 0; // 表示转换结果中对应的字符位置
            for (int i = 0; i < 16; i++) { // 从第一个字节开始，对 MD5 的每一个字节
                // 转换成 16 进制字符的转换
                byte byte0 = tmp[i]; // 取第 i 个字节
                strs[k++] = hexDigits2[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
                // >>> 为逻辑右移，将符号位一起右移
                strs[k++] = hexDigits2[byte0 & 0xf]; // 取字节中低 4 位的数字转换
            }
            return new String(strs).toUpperCase(); // 换后的结果转换为字符串
        } catch (Exception e) {
            return null;
        }
    }
}
