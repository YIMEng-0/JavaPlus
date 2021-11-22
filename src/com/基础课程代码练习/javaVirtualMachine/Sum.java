package com.基础课程代码练习.javaVirtualMachine;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/29 10:51 上午
 */
public class Sum {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}