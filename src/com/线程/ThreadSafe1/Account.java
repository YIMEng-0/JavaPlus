package com.线程.ThreadSafe1;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:11 下午
 */

/**
 * 银行账户
 *      在账户里面，使用了线程同步的机制即当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，
 *      其他线程才能对该内存地址进行操作，而其他线程又处于等待状态，实现线程同步的方法有很多；
 */
public class Account {
    // 账号
    private String actno;

    // 账户的余额
    private double balance;

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 取款方法
    public void withdraw(double money) {
        // 取款之前
        double before = this.getBalance();

        // 取款之后
        double after = before - money;

        // 更新余额
        // 当 t1 执行到了这里的时候，但是下面的余额还没有更新，t2 这个时间点进来了，一定会出现问题
        this.setBalance(after);
    }
}