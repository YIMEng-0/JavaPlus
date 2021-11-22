package com.基础课程代码练习.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 10:14 下午
 */
public class 获取给定类的父类以及实现了哪儿些接口 {
    public static void main(String[] args) throws Exception {
        Class stringClass = Class.forName("java.lang.String");

        // 获取 String 的父类
        System.out.println(stringClass.getSuperclass());

        Class[] interfaces =  stringClass.getInterfaces();
        for (Class inte : interfaces) {
            System.out.println(inte.getName());
        }
    }
}
