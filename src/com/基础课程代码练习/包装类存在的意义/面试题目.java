package com.基础课程代码练习.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 3:11 下午
 */

/**
 * String 为什么是不可以变的？
 *      因为在源代码中， String 有一个 byte[] 数组，这个数组使用了 final 进行了修饰
 *      数组一旦创建，长度不可变，使用 final 修饰的引用一旦指向了某个对象之后，不能再指向其他的对象，
 *      所以 String 是不可变的
 *
 * 为什么StringBuilder 和 StringBuffer 为什么可变？
 *      这两个东西实际上是 byte[] 数组，数组没有使用 final 进行修饰，这两个的出事的容量大小为 16 ，当存满之后，会进行数组拷贝的方式，
 *      System.arraycopy()... 从而实现扩容操作
 */
public class 面试题目 {
    public static void main(String[] args) {
        /**
         *  字符串不可变的意思？
         *      指的是双引号里面创建的内容是不可变的
         *      s 实际上没有使用 final 进行修饰，是可以变的，只是引好里面的东西是不可以变得
         *      s 可以指向其他的对象
         */
        String s = "abc";
        s = "cd";
        System.out.println(s);
    }
}
