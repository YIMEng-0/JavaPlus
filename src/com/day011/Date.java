package com.day011;
/*
    自定义的如期类型
 */

public class Date {
    private int year;
    private int month;
    private int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*
        创建误无参数的构造方法的时候，默认创建的日期是：1970-1-1
     */

    public Date() {
/**
     this.year = 1970;
     this.month = 1;
     this.day = 1;
 */
        // 可以通过另外一个构造方法进行完成 前提是 不能创建出来新的对象，以下的代码表示创建类一个全新的代码
        // new Date(1970,1,1)

        // 通过以下的方式完成构造方法的调用
        // 不用创建出来新的对象但是可以调用其他的构造方法
        this(1970, 1, 1);

    }

    // 构造函数
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}
