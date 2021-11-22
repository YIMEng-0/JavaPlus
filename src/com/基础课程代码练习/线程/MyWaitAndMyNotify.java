package com.基础课程代码练习.线程;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/15 11:49 上午
 */

/**
 * wait() notify() 两个方法不是使用线程来调用的，因为就是普通的 Object 的方法，每个对象都是拥有这个方法的；
 *
 *      wait() 方法的作用
 *          Object o = new Object();
 *          表示：让正在 o 对象上面的线程进入等待状态，直到被唤醒，无期限等待；
 *          o.wait() 会让当前的线程进入等待状态；
 *
 *      notify() 方法的作用
 *          Object o = new Object();
 *          o.notify 表示唤醒正在等待的线程；
 *
 *      notifyALl 唤醒正在 o 对象上面等待的所有线程
 *
 *
 *      生产者模式和消费者模式：
 *          创建出来了两个线程，一个负责生产，一个负责消费，两者之间需要达到一定的平衡状态，生产多了，停止生产，卖光了，开始生产；
 */
public class MyWaitAndMyNotify {
    public static void main(String[] args) {

    }
}