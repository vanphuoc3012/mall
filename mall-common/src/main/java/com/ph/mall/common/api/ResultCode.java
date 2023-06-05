package com.ph.mall.common.api;

public enum ResultCode implements IErrorCode{
    SUCCESS(200, "Success operation"),
    FAILED(500, "Failed operation"),
    VALIDATE_FAILED(400, "Bad request"),
    UNAUTHORIZED(401, "Not authorized or token has expired"),
    FORBIDDEN(403, "Not have permission"),
    NOT_FOUND(404, "Not found");

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    private final long code;
    private final String message;

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
