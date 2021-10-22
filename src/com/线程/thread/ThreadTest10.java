package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 2:37 下午
 */

/**
 * 怎么合理的终止一个线程的执行？
 *      这种方式比较常用
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        // 模拟 5 秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 终止线程
        r.run = false; // 直接修改这里为 false 即可，将线程干掉
    }
}

class MyRunnable4 implements Runnable {
    // 给定了一个布尔值的标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 每次的循环中，判断是否是 run ，进行线程的运行的进度
            if (run) {
                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                // 在这里可以进行数据的保存代码实现
                return;
            }
        }
    }
}
