package com.集合.HashSet集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 5:49 下午
 */

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 集合中元素的特点：
 *      1、没有顺序，不可重复，但是存储的元素可以按照大小进行排序；叫做：可排序集合
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 创建 TreeSet 集合对象
        Set<String> strings = new TreeSet<>();

        // 添加元素，放置字符串
        strings.add("A");
        strings.add("B");
        strings.add("K");
        strings.add("H");
        strings.add("U");
        System.out.println("===TreeSet 中的元素遍历===");
        for (String s : strings) {
            // 出来的元素是有顺序的
            // 从小到大排序的
            // 无序指的是，放进去和出来的顺序不同，没有下标；不是出来的顺序没有排序
            System.out.println(s);
        }
    }
}
