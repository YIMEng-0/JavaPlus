package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 7:16 下午
 */

/**
 * 实现线程的第二种方式：编写一个类实现下面的接口;使用了接口的方式实现了线程的并发；
 *      java.lang.Runnable
 *
 * 这种使用了实现接口的方式实现的线程的并发在实际中用的比较多的，因为可以进行继承多个类，使用起来是比较灵活的；
 */
public class ThreadTest03 {
    public static void main(String[] args) {
//        // 创建一个可以运行的对象
//        MyRunnable r = new MyRunnable();
//
//        // 将可以运行的对象进行封装
          // 创建出来了，传入到线程中，实现了线程对象的创建
//        Thread t = new Thread(r);

        // 上面的代码进行合并
        Thread t = new Thread(new MyThread());

        // 启动线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程" + i);
        }
    }
}

// 下面不是一个线程，是一个可以运行的类
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程" + i);
        }
    }
}