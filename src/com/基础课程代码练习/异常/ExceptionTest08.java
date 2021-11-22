package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/23 10:03 下午
 */

/**
 * 异常对象有两个重要的方法
 *  获取异常的简单描述信息
 *      String msg = exception.getMessage();
 *
 *  打印异常的追踪堆栈信息
 *      exception.print
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        // 这里只是 new 了一个异常的对象，并没有抛出去，所以程序是不会中断执行的
        // JVM 会将这个异常对象当作简单的对象
        NullPointerException e = new NullPointerException("空指针异常");
        System.out.println(e.getMessage());

        // 打印异常的堆栈信息
        e.printStackTrace();
        System.out.println("Hello World");

        /**
         * 因为有两个线程，一个控制打印 "Hello World";一个负责进行 printStackTrace()，所以打印的位置有的可能在上面，有的可能在下面；
         * java 在打印异常信息的追踪信息的时候，使用的是异步线程的方式；
         */
    }
}
