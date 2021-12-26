package com.基础课程代码练习.对象锁以及类锁;

/**
 * @author Doraemon
 * @date 2021/12/26 11:26 上午
 * @version 1.0
 */

/**
 * 对于对象锁的建立以及了解
 */
public class ObjectLock {

    // 创建一个非静态变量，普通的一个引用数据类型
    private Object lock = new Object();

    /**
     * 锁住非静态变量
     * 锁住之后，线程休息 10 秒
     * @throws InterruptedException
     */
    public void lockObjectField() throws InterruptedException {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(10 * 1000);
        }
    }

    /**
     * 锁住 this 对象 this 就是当前对象实例
     * 锁住之后，线程休息 10 秒
     * @throws InterruptedException
     */
    public void lockThis() throws InterruptedException {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(10 * 1000);
        }
    }

    /**
     * 直接锁住非静态方法
     * 非静态方法锁住，锁住之后休息 10 秒
     * @throws InterruptedException
     */
    public synchronized void methodLock() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(10 * 1000);
    }

    public static void main(String[] args) {
        // 使用循环，创建 5 个线程
        for (int i = 0; i < 5; i++) {
            Thread worker = new Thread(new ObjectLockWorker());
            worker.setName("kite-" + i);
            worker.start();
        }
    }

    public static class ObjectLockWorker implements Runnable {
        @Override
        public void run() {
            try {
                ObjectLock objectLock = new ObjectLock();
                // 方式 1
                objectLock.lockObjectField();
                // 方式 2
                objectLock.lockThis();
                // 方式 3
                objectLock.methodLock();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}