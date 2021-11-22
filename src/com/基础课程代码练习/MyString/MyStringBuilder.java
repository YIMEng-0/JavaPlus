package com.基础课程代码练习.MyString;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 2:21 下午
 */

/**
 * StringBuffer 和 StringBuilder 的区别？
 *      1、StringBuffer synchronized 进行修饰，StringBuffer 在多线程运行下面是安全的，
 *      2、StringBuilder 没有 synchronized 修饰，多线程下面是运行不安全的
 *      3、Buffer 是线程安全的
 */
public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(12);

    }
}
