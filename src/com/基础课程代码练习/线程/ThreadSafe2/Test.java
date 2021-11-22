package com.基础课程代码练习.线程.ThreadSafe2;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:22 下午
 */
public class Test {
    public static void main(String[] args) {
        // 创建账户对象 只创建一个对象
        // 账户里面可以保存当前的余额，进行取钱的操作
        Account act = new Account("act001", 10000);

        // 创建两个线程
        // 创建了两个线程，将账户进行传递进去，构造方法的时候，传递进去即可
        // 就是有两个人同时对于一个账户进行相关的操作，如果线程不安全的话，是会出现一定的问题的；
        // 下面的 act 是共享对象，因为两个线程传入进去的对象是同一个
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        // 设置 name
        t1.setName("t1");
        t2.setName("t2");

        // 启动线程
        // 启动了线程，开始进行取钱的操作，防止两个人取钱的时候，发生冲突，写一个线程，使得线程是安全的就行
        t1.start();
        t2.start();
    }
}
