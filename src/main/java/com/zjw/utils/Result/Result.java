package com.zjw.utils.Result;

/**
 * @Created by 张计委
 * @Classname Result
 * @Date 2019-11-18 19:24
 * @Description TODO
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    private Result(T data) {
        this.code = 0;
        this.msg = "成功";
        this.data = data;
    }
    private Result(CodeMsg codeMsg){
        if (codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }
    private Result(T data,CodeMsg codeMsg){
        this.data = data;
        if (codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public static <T> Result<T> init(T data,CodeMsg codeMsg){
        return new Result<T>(data,codeMsg);
    }

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }
    /**
     * 成功，不需要传入参数
     */
    @SuppressWarnings("unchecked")
    public static <T> Result<T> success(){
        return (Result<T>) success(null);
    }
    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }
    /**
     * 失败时候的调用,扩展消息参数
     */
    public static <T> Result<T> error(CodeMsg codeMsg,String msg){
        codeMsg.setMsg("【"+codeMsg.getMsg()+"】"+"------"+msg);
        return new Result<T>(codeMsg);
    }


    public T getData() {
        return data;
    }
    public String getMsg() {
        return msg;
    }
    public int getCode() {
        return code;
    }
}
