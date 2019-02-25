package com.ayyovei.user.util;

import lombok.*;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/2/25
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result <T>{
    private int code;

    private String msg;

    private T data;

    Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public static Result success() {

        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());

    }
    public static Result success(Object data) {
        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),data);

    }

    public static Result ok(ResultCode resultCode,Object data) {
        return new Result(resultCode.getCode(), resultCode.getMsg(),data);

    }
    public static Result ok(ResultCode resultCode) {
        return new Result(resultCode.getCode(), resultCode.getMsg());

    }

}
