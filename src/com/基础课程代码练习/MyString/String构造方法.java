package com.基础课程代码练习.MyString;

/**
 * 常用的 String 的构造方法
 * 1 String s1 = "";
 * 2 String s2 = new String(" ");
 * 3 String s3 = new String(chars);
 * 4 String s4 = new String(chars,start,length);
 * 5 String s5 = new String(bytes);
 * 6 String s6 = new String(bytes,start,length);
 */

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/17 7:50 下午
 */

/**
 * 关于 String 常用的构造方法
 */

/**
 * byte 字节 一个字节有 8 为取之范围：-128 ～ +127
 */
public class String构造方法 {
    public static void main(String[] args) {
        // 常见的最常用的字符串创建的方式为
        String s1 = "asd";

        byte[] bytes = {97,98,99};
        String s2 = new String(bytes);
        System.out.println(s2);

        /**
         * 结果分析：
         *  abc String 已经重写了 toString（）方法，所以输出不是地址，正常来讲没有重写输出的是地址
         */

        // 第一个是字节数组，第二个是，数组元素下标的开始位置，第三个是数字结束的位置
        String s3 = new String(bytes,1,2);
        System.out.println(s3);

        // char[] 数组
        char[] chars = {'h','e','l','l','o'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 将 chars 数组里面的部分元素转换为字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);
    }
}