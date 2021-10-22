package com.集合.HashSet集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 5:37 下午
 */

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 是没有顺序不能重复的
 */
public class MyHashSetTest {
    public static void main(String[] args) {
        // HashSet 集合的主要特点
        Set<String> strs = new HashSet<>();

        // 添加元素
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello2");
        strs.add("hello7");
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello2");
        strs.add("hello7");
        // 存储特点：没有顺序，并且是不能重复的
        // 存进去和出来的顺序是可以不同的
        // 放到 HashSet 集合中的额元素实际上是放在了 HashMap 集合中的 key 部分
        for (String s : strs) {
            System.out.println(s);
        }

    }
}
