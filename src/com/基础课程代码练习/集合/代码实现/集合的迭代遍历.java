package com.基础课程代码练习.集合.代码实现;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/27 5:23 下午
 */
public class 集合的迭代遍历 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList();

        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代集合
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            Object obj = it.next();

            if (obj instanceof Integer) {
                System.out.println("Integer 类型: " + obj);
            }
        }

        // 创建集合对象
        Collection c2 = new HashSet();
        // 无顺序的，存储进去的和实际出来的顺序可以是不一样的
        // 不可以重复的，前面有了 100 后面就不能继续存储 100 了

        // 添加集合元素
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(200);
        c2.add(12);
        c2.add(66);

        // 找到迭代器对象
        // c2 Collection 继承了 Iterable ，实现了 Iterator 里面的 iterator 方法
        // c2 有一个迭代器，调用了它的一个方法，就可以使用迭代器进行元素的遍历了
        Iterator it2 = c2.iterator();

        // 对元素进行输出
        while (it2.hasNext()) {
            Object obj = it2.next();
            System.out.println("hashSet 里面存储的元素是：" + obj);
        }
    }
}