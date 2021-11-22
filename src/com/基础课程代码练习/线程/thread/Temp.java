package com.基础课程代码练习.线程.thread;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/8 10:22 上午
 */
public class Temp {

    public static void main(String args[]) {
        int num = 2;
        int pow = 5;
        System.out.print(power(num , pow));
    }
    public static int power(int a , int b) {
        int power = 1;
        for (int c = 0; c < b; c++)
            power *= a;
        return power;
    }
}
