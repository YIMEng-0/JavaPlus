package com.基础课程代码练习.MyString;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/17 7:29 下午
 */

/**
 * 方法去保存的数据：
 *  UserTest.class
 *  String.class
 *  User.class
 *  代码片段
 *  静态变量
 *  ...
 *
 *  字符串常量池
 */

/**
 * 关于字符串常量池：
 *  String 对象里面保存的不是直接的字符串值，而是保存的字符串常量池中的字符串的地址
 */

/**
 * String 写不写 new 的区别就是是否走到堆空间的一步，new 是需要在堆空间中开辟内存保存字符串在字符串常量池中的数据的
 * int i = 100; 单纯的保存的是数值 100
 * String s = "abc"; 保存的是在常量池中的地址
 */

/**
 * String s1 = "abc";
 *   s1 保存的额不是实际的字符串值，是内存地址
 */
public class UserTest {
    public static void main(String[] args) {
        User  user = new User(110,"jack");

    }
}
