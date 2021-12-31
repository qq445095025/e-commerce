package com.imooc.ecommerce.advice;


import com.imooc.ecommerce.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>全局异常处理</h1>
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handlerCommerceException(
            HttpServletRequest req, Exception ex
    ) {
        CommonResponse<String> response = new CommonResponse<>(
                -1,"系统错误，请联系管理员"
        );
        response.setData(ex.getMessage());
        log.error("commerce service has error:[{}]",ex.getMessage(),ex);
        return response;
    }
}
