package com.继承;

public class Account {
    private String actNo;
    private double balance;

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){

    }
    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public double getBalance() {
        return balance;
    }
}
