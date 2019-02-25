package com.ayyovei.user.util;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/25
 */
public enum ResultCode {
    SUCCESS(0,"成功"),
    EXCEPTION(1,"系统出错啦"),
    CONN_ERR(2,"连接失败"),
    PARAM_EMPTY(3,"缺少参数"),
    PAPAM_ILLEGAL(4,"参数格式非法"),
    DATA_EMPTY(5,"数据缺失"),
    DATA_NOT_FOUND(6,"没有找到匹配的数据"),
    CONDITION_NOT_MATCH(7,"没有找到匹配的数据"),
    DATA_ILLEGAL(8,"数据格式非法"),
    DATA_ERROR(9,"数据格式非法"),
    ERROR(10,"操作失败"),
    OPERATION_UNSUPPORTED(11,"当前版本不支持的操作"),
    LOGIN_REQUIRED(12,"需要登录"),
    SERVER_NOT_START(13,"服务器未启动"),
    TOKEN_ILLEGAL(14,"token验证不通过");



    private int code;

    private  String msg;




    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
