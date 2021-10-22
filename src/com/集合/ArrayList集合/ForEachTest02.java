package com.集合.ArrayList集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 5:25 下午
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合使用增强 for 循环
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        // 创建 List com.集合
        List<String> strList = new ArrayList<>();

        // 添加元素
        strList.add("hello");
        strList.add("world");
        strList.add("kitty");

        // 使用迭代器方式
        System.out.println("===下面使用了迭代器进行元素的迭代操作===");
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // 使用 foreach 进行遍历
        System.out.println("===下面使用了增强 for 循环进行了遍历操作===");
        for (String str : strList) {
            System.out.println(str);
        }

        System.out.println("===使用了普通 for 循环===");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println("===Integer 加强 for 循环输出===");
        for (Integer num : list) {
            System.out.println(num);
        }

    }
}
