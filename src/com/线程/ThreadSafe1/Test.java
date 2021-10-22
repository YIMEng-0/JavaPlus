package com.线程.ThreadSafe1;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:22 下午
 */
public class Test {
    public static void main(String[] args) {
        // 创建账户对象 只创建一个对象
        Account act = new Account("act001",10000);

        // 创建两个线程
        // 创建了两个线程，将账户进行传递进去，构造方法的时候，传递进去即可
        // 两个线程对于同一个账号进行操作，如果产生了网络延迟，数据的更新会出现问题，需要使用排队机制
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        // 设置 name
        t1.setName("t1");
        t2.setName("t2");

        // 启动线程
        t1.start();
        t2.start();
    }
}
