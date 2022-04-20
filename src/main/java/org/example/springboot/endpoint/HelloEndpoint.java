package org.example.springboot.endpoint;

import org.example.springboot.model.ApiResponse;
import org.example.springboot.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>测试一些接口</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 09:39
 **/
@RestController
@Validated
public class HelloEndpoint {
    @GetMapping(value = "hello")
    public ApiResponse<?> hello(@RequestParam(value = "name", required = true) String name) {
        return ApiResponse.success();
    }

    @PostMapping(value = "hello")
    public ApiResponse<UserInfo> hello(@RequestBody @Valid UserInfo userInfo) {
        return ApiResponse.success(userInfo);
    }
}

