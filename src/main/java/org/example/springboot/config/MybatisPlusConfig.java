package org.example.springboot.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>mybatis plus 分页配置</p>
 *
 * @author : ninggelin
 * @date : 2022-04-21 17:13
 **/
@Configuration
public class MybatisPlusConfig {
//    @Bean
//    public PaginationInnerInterceptor paginationInterceptor() {
//        return new PaginationInnerInterceptor(DbType.MYSQL);
//    }
//
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
