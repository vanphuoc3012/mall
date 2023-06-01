package com.ph.mall.common.api;

public enum ResultCode implements IErrorCode{
    SUCCESS(200, "Success operation"),
    FAILED(500, "Failed operation"),
    VALIDATE_FAILED(404, "Validate failed"),
    UNAUTHORIZED(401, "Not authorized or token has expired"),
    FORBIDDEN(403, "Not have permission");

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    private final long code;
    private final String message;

    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
