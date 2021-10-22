package com.集合.TreeSetTest;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 4:16 下午
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 集合的创建
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 添加元素
        treeSet.add(1);
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(0);

        System.out.println("使用迭代器");
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("for 增强循环");
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}