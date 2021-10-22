package com.day01_06;

public class DateTypeTest {
    // static 需要加上
    // 赋值才能进行编译
    static int k;  // 成员变量 没有手动赋值 系统会自动赋值
    public static void main(String[] args){
        int i = 9;
        char x = 'H';
        // 反斜杠具有转义的功能
        // println 表示的是输出进行换行
        String y = "\nHello";
        System.out.println(k); // 此时系统会自动给成员变量进行赋值
        System.out.println(i);
        System.out.println(y);
        System.out.println("\"Hello\"");
        System.out.println("\\Hello\\");
        System.out.println("\\t");
        // JDK 有可以讲文字转换成 unicode 编码的工具

        int a = 10;
        int b = 010;
        int c = 0x16;

        int num1 = 10;
        int num2 = 20;
        System.out.println("10 + 20 = " + (num1 + num2));
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        String username = "Jack";
        System.out.println("Welcome Back! " + username);
    }
}
