package com.基础课程代码练习.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 10:02 下午
 */

/**
 * 线程的阻塞状态
 *      static void sleep(long millis)
 *          1、静态方法      Thread.sleep(1000),阻塞，停止一秒，然后进行程序的执行；
 *          2、参数是毫秒
 *          3、作用：让当前的线程进入休眠，放弃CPU 时间片，让其他的程序去使用
 *              出现在什么线程，线程就会进入休眠
 *          4、Thread,sleep() 间隔特定的时间，执行特定的代码
 *
 */
public class ThreadTest06 {
    public static void main(String[] args) {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // 当前的是主线程，进入休眠状态，休息 5 秒
//        System.out.println("hello world");

        // for 循环一次，睡眠一秒
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                // 睡眠一秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}