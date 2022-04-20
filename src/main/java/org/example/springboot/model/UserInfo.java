package org.example.springboot.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * <p>用户信息</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 14:50
 **/
@Data
public class UserInfo {
    @NotNull(message = "age不能为空")
    @Min(value = 10, message = "age不能小于10")
    private Integer age;
    @NotNull(message = "name不能为空")
    private String name;
}
