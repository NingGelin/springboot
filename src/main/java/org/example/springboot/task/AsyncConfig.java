package org.example.springboot.task;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 配置类 使{@link org.springframework.scheduling.annotation.Scheduled} 支持并发
 *
 * @author ninggelin
 * @date 2022-04-20 22:22:48
 */
@Configuration
@EnableAsync
public class AsyncConfig {
    private int corePoolSize = 5;
    private int maxPoolSize = 10;
    private int queueCapacity = 10;

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }
}