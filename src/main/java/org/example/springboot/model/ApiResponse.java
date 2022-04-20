package org.example.springboot.model;

import lombok.Data;
import org.example.springboot.exception.ServiceErrorEnum;

/**
 * <p>通用响应</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 14:05
 **/
@Data
public class ApiResponse<T> {
    private int code;
    private String message;
    private T result;

    public static ApiResponse<?> success() {
        return new ApiResponse<>();
    }

    public static <T> ApiResponse<T> success(T result) {
        return new ApiResponse<>(result);
    }

    public static ApiResponse<?> fail(ServiceErrorEnum serviceErrorEnum) {
        return new ApiResponse<>(serviceErrorEnum.getCode(), serviceErrorEnum.getMessage());
    }

    public static ApiResponse<?> fail(int code, String message) {
        return new ApiResponse<>(code, message);
    }

    private ApiResponse() {
        this.code = 0;
        this.message = "成功";
        this.result = null;
    }

    private ApiResponse(T result) {
        this.code = 0;
        this.message = "成功";
        this.result = result;
    }

    private ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
        this.result = null;
    }
}
