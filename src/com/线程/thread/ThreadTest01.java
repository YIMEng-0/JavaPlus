package com.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/7 10:20 下午
 */

/**
 * 分析程序中存在几个线程？
 *      除垃圾回收之外的线程数目；
 *
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        // 下面的程序中，程序只有一个栈，所以只有一个线程；
        // 只有一个主线程，一个主栈
        // 没有启动分支线程，不是一个方法是一个线程，不是这种的概念
        // 始终是在一个栈中完成的，没有启用分支栈
        // 一个栈中，自上而下的顺序逐行执行
        System.out.println("main begin");
        m1();
        System.out.println("main over");
        System.out.println(2);
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();

        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 execute");
    }
}
