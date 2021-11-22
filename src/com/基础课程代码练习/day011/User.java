package com.基础课程代码练习.day011;

/*
    this. 什么时候不能省略 ？
    用来区分局部变量以及实例变量的时候，不能进行省略
    this点 相当于引用
 */

public class User {
    // 没有加上 static 的变量都叫做实例变量
    private int id;
    private String name;
    /*
    public void setId(int a){
        // 这里使用了当前对象的调用
        this.id = a;
    }
    */

    public void setId(int id){
        // 右边的id 是形式参数 id 左边的 id 是类体当中定义的 id
        this.id = id;
    }

    public User(int a,String s){
        id = a;
        name = s;

    }
}
