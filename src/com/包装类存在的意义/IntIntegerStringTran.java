package com.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 6:53 下午
 */
public class IntIntegerStringTran {
    public static void main(String[] args) {
        // int 转换 String
        int i = 100;
        String i1 =  String.valueOf(i);

        // String 转换为 int
        int i2 = Integer.parseInt("123");

        // int 转换为 Integer 自动装箱
        // Integer 转换为 int 自动拆箱

        // String 转 Integer
        Integer i3 = Integer.valueOf("123");

        // Integer 转换为 String
        String i5 = String.valueOf(21);
    }
}