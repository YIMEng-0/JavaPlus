package com.基础课程代码练习.OOP;

public class OOTest06 {
    public static void main(String[] args){
        Student stu = new Student();
        Computer computer = new Computer();

        // 学生有了一个电脑
        stu.c = computer;
    }
}
