package com.集合.代码实现;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/27 5:53 下午
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * 深入学习 Collection 中的 contains 方法
 * boolean contains(Object o) 判断集合中是否包含某个对象 o
 *      如果包含返回 true 不包含返回 false
 *
 *      contains() 方法是用来判断集合中是否包含某个元素的方法，在底层是使用 equals() 方法进行判断的，内容相同的就会返回 true；
 *
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        // 输出集合中元素的个数
        System.out.println("集合中的元素：" + c.size());

        String x = new String("abc");
        System.out.println(c.contains(x));

        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c.contains(2));

    }
}
