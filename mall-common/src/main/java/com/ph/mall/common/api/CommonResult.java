package com.ph.mall.common.api;

import lombok.Data;

@Data
public class CommonResult<T> {
    /**
     * Status code
     */
    private long code;
    /**
     * Response message
     */
    private String messge;
    /**
     * Response data
     */
    private T data;

    protected CommonResult() {

    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.messge = message;
        this.data = data;
    }

    /**
     *
     * @param data data
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), message, null);
    }

    public static <T> CommonResult<T> notFound(String messge) {
        return new CommonResult<>(ResultCode.NOT_FOUND.getCode(), messge, null);
    }
}
