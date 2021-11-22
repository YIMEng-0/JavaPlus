package com.基础课程代码练习.线程.ThreadSafe3;


public class Account {
    private String actno;
    private double balance;

    // 这是一个实例变量， Account 对象是多线程共享的，Account 对象中的实例变量 obj 也是共享的；
    Object obj = new Object();

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
            double before = this.getBalance();
            double after = before - money;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setBalance(after);
    }
}