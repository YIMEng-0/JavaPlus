package com.集合.ArrayList集合;

import java.util.HashSet;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 10:23 上午
 */
public class WhatIsHashSet {
    //    HashSet
    //    HashSet 允许出现null 值
    //    HashSet 里面没有顺序，不会记录插入的顺序
    //    不是线程安全的
    //    HashSet 中的元素实际上是对象，常见的基本类型可以使用相关的包装类
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();

        // 进行元素的添加
        sites.add("Hello");
        sites.add("world");
        System.out.println(sites.contains("world"));

        sites.remove("world");
        System.out.println(sites);

        // 重复的元素是不会添加的
        sites.add("Hello");
        System.out.println(sites);
        System.out.println("HashSet 的大小是：" + sites.size());

        // 使用for - each 进行元素的迭代
        // 进行元素的输出
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
