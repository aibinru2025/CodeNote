package com.thread.demo02;

import java.util.concurrent.*;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 10:09
 * @description:
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //创建任务
        Callable<Integer>[] task = new Callable[5];
        for (int i = 0; i < task.length; i++) {
            final int index = i;
            task[i] = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    TimeUnit.SECONDS.sleep(index+1);
                    return (index + 1 ) * 100;
                }
            };
        }

        //将Callable包装为FutureTask 通过future获取结果，所以所用就是获取结果
        FutureTask<Integer>[] futureTasks = new FutureTask[task.length];
        for (int i = 0; i < futureTasks.length; i++) {
            futureTasks[i] = new FutureTask<>(task[i]);
            executorService.submit(futureTasks[i]);
        }

        //获取任务结果
        for (int i = 0; i < futureTasks.length; i++) {
            System.out.println("获取任务结果为："+futureTasks[i].get());
        }
        executorService.shutdown();

    }
}
