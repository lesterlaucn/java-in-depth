package com.tenstone.jdk.multithread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * Created by liuyuancheng on 2022/5/2  <br/>
 *
 * @author liuyuancheng
 */
@Slf4j
public class ThreadPoolExecutorDemo {

    private static final ThreadLocal<Long> START_TIME = new ThreadLocal<>();

    public static class JobRunnable implements Runnable {

        private final Integer id;

        public JobRunnable(Integer id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("task finished : {}.", id + 1);
        }

    }

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(10, 20, 1000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(30),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        ) {
            // 用于清理ThreadLocal的钩子，防范内存泄露
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);
                START_TIME.remove();
            }
        };
        for (int i = 0; i <= 45; i++) {
            es.execute(new JobRunnable(i));
        }
    }
}
