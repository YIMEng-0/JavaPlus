package com.基础课程代码练习.day09;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String addr;


    // command + n  选择 getter 和 setter 进行一次性的生成
    // setter and getter 方法
    // 想要进行安全控制的话 可以进行相关的代码的编写
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
