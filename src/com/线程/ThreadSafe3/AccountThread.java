package com.线程.ThreadSafe3;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:19 下午
 */


public class AccountThread extends Thread {
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }
    // 实现的线程
    @Override
    public void run() {
        double money = 5000;
        synchronized (act) {
            act.withdraw(money);
            System.out.println("当前对象的名字是： " + this.getName()); // this 代表的就不是共享对象了，出现了问题；new 了两个线程对象
        }

        System.out.println(Thread.currentThread().getName() + "账户：" + act.getActno() +
                "取款成功！" + "余额是：" + act.getBalance());
    }
}
