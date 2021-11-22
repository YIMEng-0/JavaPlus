package com.基础课程代码练习.线程.ThreadSafe2;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:19 下午
 */


public class AccountThread extends Thread {
    // 两个线程共享同一个账户对象
    private Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act) {
        this.act = act;
    }

    // 实现的线程
    @Override
    public void run() {
        // t1 和t2 对于此方法是会并发的；（t1 t2 两个栈，操作堆里面的同一个对象）
        // run 方法的执行表示进行取款的操作
        // 假设取款 5k
        double money = 5000;

        // 取款
        // 里面将共享对象进行填入即可
        // 扩大了同步的范围
        synchronized (act) { // 在这里写this 是不对的，因为在这里这个对象是没有共享的，this 进来之后，两个线程new 了两次 是不一样的
            // 因为线程对象 new 了两次，出现了两个内存地址，所以是不对的；
            act.withdraw(money);
        }

        System.out.println(Thread.currentThread().getName() + "账户：" + act.getActno() + "取款成功！" + "余额是：" + act.getBalance());
    }
}
