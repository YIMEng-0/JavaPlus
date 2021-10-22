package com.day09;

public class UserConstructor {
    public static void main(String[] args) {

    }

    // 下面展示构造方法的重载
    public UserConstructor(int i){
        System.out.println("这里的构造函数是具int 有参数的");
    }
    public UserConstructor(String name){
        System.out.println("这里的构造函数的具有String 数据类型的参数的");

    }
    public UserConstructor(){

    }

}
