package org.example.springboot.exception;

/**
 * 服务错误码枚举
 *
 * @author ninggelin
 * @date 2022-04-20 14:16:45
 */
public enum ServiceErrorEnum {
    /**
     * 参数校验失败
     */
    PARAM_VALID_ERROR(-1, "参数有误"),
    ;

    /**
     * 错误码
     */
    private int code;

    /**
     * 错误信息
     */
    private String message;

    ServiceErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
