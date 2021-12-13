package com.基础课程代码练习.线程.博客代码实现;

import java.awt.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Doraemon
 * @date 2021/12/11 12:03 下午
 * @version 1.0
 */
public class CallableTest {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new MyCallable());

        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            Thread.sleep(1000);
            System.out.println("返回结果：" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "main() 方法执行结束");
    }
}
