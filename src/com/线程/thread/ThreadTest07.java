package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 10:11 下午
 */

/**
 * 一个面试题目：
 *
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        // 创建线程对象
        Thread t = new MyThread07();
        t.setName("t");
        t.start();

        // 调用 sleep 方法 让主线程进行对面，这是一个静态方法
        try {
            // 这段代码会让 t 线程进去休眠模式吗？
            // 不会
            // sleep 是一个静态的方法，在运行的时候，会转换成为：Thread.sleep
            // 运行代码的作用是让当前的线程进入睡眠，这是在主线程里面的，只是会让主线程进去睡眠
            // 主线程的休眠和 t 线程是没有关系的；
            // 阻塞的是当前线程，和其他的线程是没有关系的；
            // main 运行了之后，睡觉了
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}

class MyThread07 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
