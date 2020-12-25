package com.yibo.data.api;

import lombok.Data;

/**
 * http 接口返回格式
 *
 * @author 莫问
 * @date 2020/9/18
 */
@Data
public class ApiResult<T> {

    /**
     * 0 为成功
     */
    public static final int DEFAULT_SUCCEED_CODE = 0;

    /**
     * 默认成功提示语
     */
    public static final String DEFAULT_SUCCEED_MESSAGE = "操作成功";

    /**
     * 返回错误码
     */
    private int code;

    /**
     * 返回错误信息字符串
     */
    private String message;

    /**
     * 实际结果内容
     */
    private T result;

    public ApiResult() {
        this(null);
    }

    public ApiResult(T result) {
        this(DEFAULT_SUCCEED_CODE, DEFAULT_SUCCEED_MESSAGE, result);
    }

    public ApiResult(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static <T> ApiResult<T> success(T result) {
        return success(null, result);
    }

    public static <T> ApiResult<T> success(String message, T result) {
        return new ApiResult<T>(DEFAULT_SUCCEED_CODE, message, result);
    }
}
