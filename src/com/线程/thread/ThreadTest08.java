package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 10:33 下午
 */

/**
 * 线程被终止了之后，如何唤醒呢？
 *      不是中断 t 线程的执行，而是中断 t 线程的睡眠
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        // 下面是使用了第二种创建线程的方式对于线程进行创建，将两个部分合并到了一个部分
        Thread t = new Thread(new MyRunable());
        t.setName("t");
        t.start();

        // 主线程进入休眠状态，希望在 5 秒之后，t 线程醒来
        // 主线程的阻塞状态结束了，让其他的线程开始工作
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 主线程中断 t 线程的睡眠，让 t 线程醒来
        // 干扰睡觉，醒来
        // 这种中断方式，依靠了 java 里面的异常机制
        t.interrupt();
    }
}

class MyRunable implements Runnable {
    // run 方法只能 try 不能 throws
    // 因为 run 的父类中没有抛出异常，子类不能抛出去比父类还多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> begin");

        // 在主线程里面，这个线程的睡眠是会被打断的；
        // interrupt() 打断即可
        try {
            // 不能 throws 只能 try
            // 子类不能比父类抛出更多的异常
            Thread.sleep(1000 * 60 * 60 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 执行睡醒来的代码
        System.out.println(Thread.currentThread().getName() + "---> end");


        // 只能 try 因为 run 实现的类不能抛出异常
        try {
            doOther();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 这个可以抛出，是继承了 Object 里面可以跑出来异常
    public void doOther()throws Exception {

    }
}
