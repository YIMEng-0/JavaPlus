package com.基础课程代码练习.集合.ArrayList集合;

import java.util.ArrayList;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/29 11:17 下午
 */
public class ArrayListTest {
    // 什么是 ArrayList?
    /*
        可以进行动态修改的数字，与普通的数组之间的区别就是，没有固定大小的限制，，进行添加以及删除元素；

        import java.util.ArrayList; // 引入 ArrayList 类

        ArrayList<E> objectName =new ArrayList<>();　 // 初始化
        E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
        objectName: 对象名。
     */

    public static void main(String[] args) {
        // 使用了泛型，可以对于插入的元素记性限制
        ArrayList<String> sites = new ArrayList<>();

        // 使用add 函数进行元素的添加
        sites.add("www");
        sites.add("baidu");
        sites.add("com");
        System.out.println(sites);
        System.out.println("======");

        sites.set(1, "qq");
        System.out.println(sites);

        System.out.println("======");
        // 进行元素的输出
        for (String i : sites) {
            System.out.println(i);
        }

        // 用来存放整数元素
        ArrayList<Integer> numbers = new ArrayList<Integer>();
    }
}
