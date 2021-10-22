package com.线程.ThreadSafe1;

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
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "账户：" + act.getActno() + "取款成功！" + "余额是：" + act.getBalance());
    }
}
