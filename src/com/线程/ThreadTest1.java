package com.线程;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/12 4:28 下午
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据的线程");


        // 在线程的启动之前，将线 t 程设置为守护线程
        // 主线程结束之后，线程就会结束
        // 主线程就是用户线程，用户线程结束之后，守护线程就会结束
        // 主线程的 main 方法就是一个用户线程，当用户线程结束之后，守护线程就会结束；自动结束线程
        t.setDaemon(true); // 创建了了一个守护线程
        t.start();

        // 主线程：主线程是用户数据
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread {
    @Override
    public void run() {
        int i = 0;

        // 因为 t 线程是一个守护线程，所以当守护的东西，就是主线程结束的时候，守护线程失去了存在的意义，自己就会结束自动终止
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}