package com.基础课程代码练习.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 9:39 下午
 */

/**
 * 1、获取当前线程的对象？
 * Thread thread = Thread.currentThread();
 * 返回的东西就是当前线程；
 *
 * 2、获取线程对象的名字
 * 线程对象.getName()
 *
 * 3、修改线程对象的名字
 * 线程对象.setName()
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        // 当前线程对象 这个出现在了主方法中，当前的线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println("当前线程的名字是：" + currentThread.getName()); // main

        // 创建线程对象
        MyThread05 t = new MyThread05(); // 这里已经是支线程了，不是主线程，主线程的名字是 main 这里的名字是 t 下面设置了
        // 设置线程的名字
        t.setName("t");
        // 获取线程的名字
        System.out.println(t.getName()); // 获取到线程的名字
        // 开始线程
        t.start();

        // 创建新的线程执行
        MyThread05 t1 = new MyThread05();
        t1.setName("t1"); // 重新给支线程定义了一个名字 叫做 t1
        t1.start();
    }
}

class MyThread05 extends Thread{
    @Override
    public void run() {
        // super this 也可以使用，拿到
        Thread currentThread = Thread.currentThread();

        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread.getName() + " 正在是分支线程 " + i);
        }
    }
}
