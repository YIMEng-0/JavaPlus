package com.基础课程代码练习.day01_06;
/*
    分析以下的输出结果
 */

public class MethodTest07 {
    public static void main(String[] args){
        System.out.println("Main begin");
        m1();

        // 下面的调用是最后结束的 main 函数 一行一行的运行
        // 方法中断额语句执行的顺序是从上到下的
        System.out.println("Main Over");
    }

    public static void m1(){
        System.out.println("m1 Begin");
        m2();
        System.out.println("m1 Over");
    }

    public static void m2(){
        System.out.println("m2 Begin");
        m3();
        System.out.println("m2 Over");
    }

    public static void m3(){
        System.out.println("m3 Begin");
        System.out.println("m3 Over");
    }
}
