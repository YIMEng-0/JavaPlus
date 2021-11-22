package com.基础课程代码练习.集合.Map集合;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/1 2:57 下午
 */
public class MyClass {
    // 声明一个静态的内部类
    private static class InnerClass {
        public static void m1() {
            System.out.println("静态内部类的 m1 方法执行");
        }

        // 静态内部类中的实例方法执行
        public void m2() {

        }
    }

    public static void main(String[] args) {
        // 外部类.内部类.方法
        // 类的名字叫做 MyClass.InnerClass
        MyClass.InnerClass.m1();

        // 创建了静态内部类对象
        // 不是静态的方法，需要使用相关的对象进行创建
        MyClass.InnerClass mi = new MyClass.InnerClass();
        mi.m2();

        // 给一个 Set com.基础课程代码练习.集合
        // Set 集合中存储的对象是：MyClass.InnerClass 类型
        Set<MyClass.InnerClass> set = new HashSet<>();

        // 下面的 Set 集合中存储的是字符串对象
        Set<String> set2 = new HashSet<>();

        Set<MyMap.MyEntry<Integer,String>> set3 = new HashSet<>();
    }
}

class MyMap {
    public static class MyEntry<K,V> {

    }
}