package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/23 10:18 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 看到了程序打印出来的追踪信息，怎么查看？可以进行快速的调试程序？
 *      调试程序，从上面向着下面进行查看，SUN 公司的代码不需要查看，只需要看自己写的东西
 */

/**
 * 异常的两个常用方法
 * String msg = e.getMessage();
 * e.printStackTrace();
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            // 打印异常追踪信息！！！
            // 实际的开发中是比较推荐使用这个的
            // 遇到问题直接解决即可
            // 堆栈的异常信息的打印捕捉
            e.printStackTrace();
        }

        // 使用 try catch 的好处就是，捕捉到了异常，但是服务器仍然在执行，不会有太大的影响
        System.out.println("程序还在执行！");
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        new FileInputStream("");
    }
}