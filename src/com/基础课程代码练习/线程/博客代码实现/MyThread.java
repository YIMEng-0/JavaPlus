package com.基础课程代码练习.线程.博客代码实现;

/**
 * @author Doraemon
 * @date 2021/12/10 9:08 上午
 * @version 1.0
 */

import java.util.Comparator;

/**
 * 使用了继承 Thread 的方式实现进程的运行
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run 方法正在执行...");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() + " main 方法执行结束");

        new Thread(() -> System.out.println("多线程任务执行！")).start();

        new Thread().start();

        new Thread(() -> {
            System.out.println("多线程任务执行！");
            System.out.println("多线程任务执行的多行代码");
            int a = 9,b = 10,sum;
            System.out.println(a + b);
            return;
        }).start();

    }
}
