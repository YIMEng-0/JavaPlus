package com.基础课程代码练习.集合.ArrayList集合;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 2:21 下午
 */
public class WhatisIterator {
    public static void main(String[] args) {
        // Iterator 不是一个集合而是一个访问集合的方法
        // 里面的基本操作是：next() hasNext() remove()
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("hello");
        sites.add("world");
        sites.add("Tom");
        sites.add("Jack");

        // 获取迭代器的操作
        Iterator<String> it = sites.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());

        // 进行迭代输出操作
        System.out.println("======");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("======");

    }
}
