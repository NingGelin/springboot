package org.example.springboot;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>lock练习</p>
 *
 * @author : ninggelin
 * @date : 2022-05-03 16:52:39
 **/
public class LockExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 200; i++) {
            int finalI = i;
            executorService.execute(() -> {
                list.add(finalI);
            });
        }
        Thread.sleep(1000);
        System.out.println(list.size());
    }
}
