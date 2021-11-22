package com.基础课程代码练习.MyString;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/17 7:48 下午
 */

/**
 * 分析创建了几个对象
 */
public class StringTest {
    public static void main(String[] args) {
        /**
         * 一共有三个对象
         *  堆内存中有两个，常量池中有一个对象
         */

        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
