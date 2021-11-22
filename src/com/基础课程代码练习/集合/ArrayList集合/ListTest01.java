package com.基础课程代码练习.集合.ArrayList集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/29 8:06 下午
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试List 接口中的常用方法
 *  1、List 存储元素的特点是什么？
 *      1、有顺序，可以重复，集合中的元素有下标，从 0 开始，还可以继续存储
 *      2、List 是 Collection 中的子接口，有自己特定的方法
 *
 *      下面是 List 中常用的特有的方法
 *      void Add(int index,Object element)
 *      Object get(int index)
 *      int indexOf(Object o) 返回的是出现的索引的位置
 *      Object remove(int index)
 *      E set(int index,E element)
 */

public class ListTest01 {
    public static void main(String[] args) {
        // 创建 list 类型的集合
        List myList = new ArrayList();

        // 向着集合中添加元素
        myList.add("A"); // 默认都是在集合的末尾添加元素的
        myList.add("B");
        myList.add("C");
        myList.add("D");

        myList.add(1,"KING"); // 使用不多，因为使用的效率比较低下
        Iterator it = myList.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // 根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        for (int i = 0; i < myList.size(); i++) {
            // 使用集合中自己的方法，进行集合的遍历，得到相关的数值
            // 集合中所特有的 Set 中是没有这种方式的；
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        // 获取指定对象的第一次出现的索引
        System.out.println(myList.indexOf("KING"));

        // 获取元素随后出现位置的索引
        // indexOf() 修改成为 lastIndexOf()

        // 删除下标为 index 位置的元素
        System.out.println(myList.remove(0));

        // 设置某个索引位置的元素
        System.out.println(myList.set(0,121));
    }
}
