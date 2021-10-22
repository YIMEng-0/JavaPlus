package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 2:28 下午
 */

/**
 * 强行终止线程的执行，
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        // 先创建出来一个 Thread 对象，然后，将自己创建出来的线程传递进去即可
        Thread t = new Thread(new MyRunable3());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 5 秒之后，强行终止 t 线程
        /**
         * stop 方法的缺点：容易损坏数据，直接将线程干掉了，线程没有保存的数据是会丢失的；
         *
         */
        t.stop(); // 过时了 不推荐使用
    }
}

// 类实现了 Runnable 接口，进行线程的执行
class MyRunable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +"--->" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
