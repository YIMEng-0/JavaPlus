package com.基础课程代码练习.线程.锁;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/12 10:39 上午
 */

/**
 * 死锁代码需要会写，自己知道什么是错误的，以后在开发中才不会写出来，因为死锁不好调试
 * 程序一般会僵持在那里；形成了死锁，导致程序是一直僵持的状态；
 */

/**
 * 当有一个线程睡一秒的时候，就会发生错误
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        // 下面的两个线程是共享两个对象的；
        // 两个线程之间是一种相互锁住的状态；
        Thread t1 = new Mythread1(o1,o2);
        Thread t2 = new Mythread2(o1,o2);

        // 将两个线程启动
        t1.start();
        t2.start();
    }
}

class Mythread1 extends Thread{
    Object o1;
    Object o2;

    public Mythread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {

            }
        }
    }
}

class Mythread2 extends Thread{
    Object o1;
    Object o2;

    public Mythread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {

            }
        }
    }
}
