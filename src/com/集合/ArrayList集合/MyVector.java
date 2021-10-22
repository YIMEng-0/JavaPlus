package com.集合.ArrayList集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 2:52 下午
 */

/**
 *         // 创建一个 Vector com.集合，满了之后，进行扩容
 *         // 扩容之后的元素：扩展容量之后，集合变为原来的 2 倍；10 ————>20
 *         // ArrayList 扩容操作：每次进行 1.5 倍的扩容
 *
 *         Vector 里面的所用方法是线程同步的，都有 synchronized(线程同步) 关键字；是安全的
 *         效率是比较低的，现在的使用是比较少得
 *
 *         怎么将线程不安全的 ArrayList 集合转换为线程安全的？
 *              使用集合工具类：
 *                  java.util.Collections 这个是工具类
 *                  java.util.Collection 是接口
 */
public class MyVector {
    public static void main(String[] args) {

        List vector = new Vector();

        // 默认容量是 10
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        // 以后可能使用到的东西
        List myList = new ArrayList(); // 非线程安全

        // 变成线程安全的
        Collections.synchronizedList(myList);// 后面的多线程部分进行讲解
        myList.add(111);
        myList.add(222);
        myList.add(333);


    }
}
