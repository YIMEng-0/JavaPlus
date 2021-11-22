package com.基础课程代码练习.MyString;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 12:34 下午
 */

/**
 *  为什么不使用 + 进行大量的字符串的拼接？
 *      Java 创建字符串的时候，在方法区的常量池内存中会不断的创建大量的字符串导致空间的严重浪费
 *
 *  String s = abc;
 *  s += "hello";
 *      上面的代码中，创建了三个对象：abd hello abchello
 *      频繁创建，势必导致内存的严重浪费，常量池有巨大的压力
 */

/**
 * Java 中的大量的字符串的拼接工作，建议使用 StringBuffer 和 StringBuilder
 */

/**
 * 如何优化 StringBuffer？
 *      在创建 StringBuffer 的时候，尽量减少扩容的次数，尽量使用初始比较大一些的容量
 *      需要进行大致的估计
 */
public class MyStringBuffer {
    public static void main(String[] args) {
        /**
         * StringBuffer 的底层实际上是 byte[] 数组，向StringBuffer 中存放字符串，实际上是在向 byte[] 字符串中存放内容
         * StringBuffer 默认容量是 16
         */
        // 创建一个初始化容量为 16 byte[] 数组，（字符串缓冲区域）
        // 拼接字符串，使用 append() 方法
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        // append 方法的内存使用满了之后，会自动进行扩容的操作，默认是 16 个 byte[] 数组
        stringBuffer.append(123);
        System.out.println(stringBuffer);

        // 自己指定创建容器的大小
        // 创建合适的大小，提高程序的运行效率
        StringBuffer sb = new StringBuffer(10);
        sb.append("hajsdkfhasjkdfhaksj");
        System.out.println(sb); // 会自动进行扩容给的太大需要扩容
    }
}
