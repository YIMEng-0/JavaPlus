package com.基础课程代码练习.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 7:25 下午
 */

/**
 * 使用匿名内部类进行实现
 */

/**
 * 当一个线程遇到了阻塞状态的时候，比如接收用户的键盘输入，或者使用sleep() 方法等；
 * 此时的线程会进入阻塞状态，阻塞状态的线程会放弃之前占有的CPU 时间片；
 * 当阻塞状态结束后，当前的程序会进去就绪状态，在这里分配到到了CPU 时间片之后，才会进行运行状态；
 *
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        // 接口可以在后面直接 new  但是在后面需要使用 {} 表示实现了接口中的方法
        // 在这里会进行时间片的抢夺，谁抢到了，谁就进行语句的执行
        // 就绪和运行之间是会不断进行切换的，争夺CPU 时间片，执行相关的语句
        // 线程在就绪和运行状态之间是不断进行切换的
        // 可以抢到多次的CPU 时间片
        Thread t = new Thread(new Runnable() { // new 了一个没有名字的类实现了接口，接口不能 new 对象，但是类可以实现接口，只是这里没有名字而已
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程" + i);
                }
            }
        });
        // 上面的是一种函数式编程，在构造方法中传递进去的是一个函数

        // 启动线程
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("这是主线程" + i);
        }
    }
}