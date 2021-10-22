package com.day07;
/*
    方法的递归调用
    递归的算法比较消耗内存 尽量不实用
    java.lang.StackOverflowError 栈的益处的错误
    发生了之后 JVM 将会停止工作
    递归必须有结束条件 否则就会爆栈
    递归的太深 不好

    目录的拷贝必须使用递归的方法

    压栈 也需要 弹栈 动态平衡
 */

public class 方法的递归调用 {
    // 主方法
    public static void main(String[] args){
        System.out.println("Main Began");
        doSome();
        System.out.println("Main Over");

    }
    // 以下的代码片段虽然只有一份 但是可以进行重复多次的使用 会将栈撑爆
    // 并且只要进行重复的调用 进行分配内存空间 无限循环
    // 一直押入就会爆
    public static void doSome(){
        System.out.println("Do Some Began");
        doSome();
        System.out.println("Do Some Over");
    }
}
