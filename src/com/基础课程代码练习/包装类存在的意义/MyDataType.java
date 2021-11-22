package com.基础课程代码练习.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 2:35 下午
 */

/**
 * 基本数据类型对象的包装类有：
 *  byte
 *  short
 *  int
 *  lang
 *  float
 *  double
 *  boolean
 *  char
 *
 *  除了 int 是 Integer
 *      char 是 Character
 *      其他数据类型的包装类都是基本数据类型的大写
 */

/**
 *  8 种基本数据类型的包装类中有 6 个都是继承 Number 的，需要先学习它的父类是什么情况，先研究Number中公共的方法
 *  Number 是抽象类，无法实例化对象
 */
public class MyDataType {
    public static void main(String[] args) {
        // 123 这个基本数据类型，进行了构造方法的包装，包装成为了引用数据类型；
        // 基本转换为引用 装箱
        Integer integer = 123;

        // 将引用转换为基本数据类型，
        float f = integer.floatValue(); // 引用数据类型转换为基本数据类型
        System.out.println(f);

        // 引用转换为了基本数据类型 拆箱·
        int i = integer.intValue();
    }
}
