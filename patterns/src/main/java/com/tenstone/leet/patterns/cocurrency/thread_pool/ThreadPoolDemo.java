package com.tenstone.leet.patterns.cocurrency.thread_pool;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * Created by liuyuancheng on 2022/1/17  <br/>
 *
 * @author liuyuancheng
 */
@Slf4j
public class ThreadPoolDemo {
    public static void main(String[] args) {
        log.info("Program started");

        // Create a list of tasks to be executed
        var tasks = List.of(
                new PotatoPeelingTask(3),
                new PotatoPeelingTask(6),
                new CoffeeMakingTask(2),
                new CoffeeMakingTask(6),
                new PotatoPeelingTask(4),
                new CoffeeMakingTask(2),
                new PotatoPeelingTask(4),
                new CoffeeMakingTask(9),
                new PotatoPeelingTask(3),
                new CoffeeMakingTask(2),
                new PotatoPeelingTask(4),
                new CoffeeMakingTask(2),
                new CoffeeMakingTask(7),
                new PotatoPeelingTask(4),
                new PotatoPeelingTask(5));

        // Creates a thread pool that reuses a fixed number of threads operating off a shared
        // unbounded queue. At any point, at most nThreads threads will be active processing
        // tasks. If additional tasks are submitted when all threads are active, they will wait
        // in the queue until a thread is available.
        var executor = Executors.newFixedThreadPool(3);

        // Allocate new worker for each task
        // The worker is executed when a thread becomes
        // available in the thread pool
        tasks.stream().map(Worker::new).forEach(executor::execute);
        // All tasks were executed, now shutdown
        executor.shutdown();
        while (!executor.isTerminated()) {
            Thread.yield();
        }
        log.info("Program finished");
    }
}
