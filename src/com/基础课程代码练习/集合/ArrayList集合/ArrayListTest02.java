package com.基础课程代码练习.集合.ArrayList集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 2:32 下午
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        // 默认初始化容量 10
        List myList1 = new ArrayList();
        // 指定初始化容量 100
        List myList2 = new ArrayList(100);

        // 创建 hashSet com.基础课程代码练习.集合
        Collection c = new HashSet();
        // HashSet 中存储元素
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        // 使用了下面的构造方法，将 HashSet 集合转换成为了 List com.基础课程代码练习.集合
        List myList3 = new ArrayList(c);
        for (int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(i));
        }
    }
}