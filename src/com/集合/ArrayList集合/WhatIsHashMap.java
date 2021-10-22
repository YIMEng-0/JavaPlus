package com.集合.ArrayList集合;

import java.util.HashMap;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 10:40 上午
 */
public class WhatIsHashMap {
    /*
        什么是HashMap?
            这是一个散列表，存储的内容是（key - value）映射

        相关的特点：
            实现了 map 接口，更具HashCode 进行值的存储，有着比较快的访问速度，最多允许一条记录的键为 null ，不支持线程同步
            HashMap 没有顺序，不会记录插入的顺序

     */
    public static void main(String[] args) {

        // 创建一个
        HashMap<Integer,String> sites = new HashMap<Integer,String>();
        sites.put(1,"Hello");
        sites.put(2,"World");
        sites.put(0,"niHao");
        System.out.println(sites);

//        sites.clear();
        System.out.println(sites);
        System.out.println(sites.size());

        // 对于key 以及 value 同时进行输出
        for (String i:sites.values()){

            System.out.println("键和值同时进行输出的结果为：" + "Key:" + i + "  " + "value" + sites.get(i));
        }

        System.out.println("======");
        for (String i:sites.values()){
            System.out.println("对于value 的值进行输出" + i + ',');
        }

    }
}
