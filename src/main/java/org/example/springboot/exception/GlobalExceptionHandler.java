package org.example.springboot.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.springboot.model.ApiResponse;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * <p>全局异常捕获</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 13:44
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * {@link org.springframework.web.bind.annotation.RequestParam} 参数校验异常
     * @param e {@link MissingServletRequestParameterException}
     * @return ApiResponse
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ApiResponse<?> requestParamValid(MissingServletRequestParameterException e) {
        return ApiResponse.fail(ServiceErrorEnum.PARAM_VALID_ERROR.getCode(), e.getParameterName() + "不能为空");
    }

    /**
     * {@link org.springframework.web.bind.annotation.ResponseBody} body体为空异常
     * @param e {@link HttpMessageNotReadableException}
     * @return ApiResponse
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ApiResponse<?> requestBodyValid(HttpMessageNotReadableException e) {
        return ApiResponse.fail(ServiceErrorEnum.PARAM_VALID_ERROR.getCode(), "body体为空");
    }

    /**
     * {@link org.springframework.web.bind.annotation.ResponseBody} + {@link javax.validation.Valid} + {@link javax.validation.constraints.NotNull}等等 body体内参数校验异常
     * @param e {@link MethodArgumentNotValidException}
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ApiResponse<?> requestBodyParamValid(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining(", "));
        return ApiResponse.fail(ServiceErrorEnum.PARAM_VALID_ERROR.getCode(), message);
    }
}
