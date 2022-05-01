package org.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>启动类</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 09:37
 **/
@SpringBootApplication
@MapperScan("org.example.springboot.mapper")
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }
}
