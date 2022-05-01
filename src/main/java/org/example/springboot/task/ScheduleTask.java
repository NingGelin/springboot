package org.example.springboot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * <p>定时任务测试</p>
 * 默认是单线程的，如果多个定时任务可能会发生阻塞。
 *
 * @author : ninggelin
 * @date : 2022-04-20 22:09:06
 **/
//@Component
@EnableScheduling
@Slf4j
@Async
public class ScheduleTask {
    @Scheduled(cron = "*/2 * * * * *")
    public void test1() {
        log.info("date: {}, thread: {}", new Date(), Thread.currentThread().getName());
    }

    @Scheduled(cron = "*/2 * * * * *")
    public void test2() {
        log.info("date: {}, thread: {}", new Date(), Thread.currentThread().getName());
    }
}
