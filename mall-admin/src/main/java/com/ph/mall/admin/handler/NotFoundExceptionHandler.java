package com.ph.mall.admin.handler;

import com.ph.mall.common.api.CommonResult;
import com.ph.mall.common.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class NotFoundExceptionHandler {
    @ExceptionHandler(ItemNotFoundException.class)
    public CommonResult<String> handleNotFoundException(ItemNotFoundException e) {
        log.debug("ItemNotFoundException: {}", e.getMessage());
        return CommonResult.notFound(e.getMessage());
    }
}
