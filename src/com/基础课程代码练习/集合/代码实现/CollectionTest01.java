package com.基础课程代码练习.集合.代码实现;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/26 8:26 下午
 */

// 关于 java.util.Collection 接口中常用的方法
// 单独学习的接口，其他的东西继承了它，这是一个基础的东西，需要掌握

import java.util.ArrayList;
import java.util.Collection;

/**
 *  1、Collection 中可以存放什么样子的元素？
 *      没有使用范型以前 ，Collection 中可以存储 Object 的所有子类型
 *      使用了范型之后，Collection 中只能存储某一个具体的类型
 *      集合的后期会学习；
 *      只要是 Object 的子类，该元素就是可以存储的；
 *      集合中不能存储基本数据类型，也不能存储 Java 对象只是存储 Java 对象的内存地址；
 *  2、Collection 中的常用方法：
 *      boolean add(object e)
 *      int size() 获取到集合中元素的个数
 *      void clear() 清空集合
 *      boolean contains(Object o) 判断当前集合中是否包含元素；包含返回 true ,错误返回 false
 *      boolean remove(Object o) 删除集合中的某个元素
 *      boolean isEmpty() 判断集合中元素的个数是否是 0；集合中的元素是否是空的
 */

/**
 * 迭代器：遍历集合中的元素
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建集合对象
        // 接口 Collection 是 一个接口，是没有办法进行实例化的

        // 多态的使用：父类型的引用指向子类型的对象
        Collection c = new ArrayList();

        // 测试 Collection 中的常用方法
        c.add(100); // 实际存放的是对象的内存地址 集合中只能存放对象的内存地址
        c.add(3.1415926);
        c.add(true);

        // 获取元素中集合的个数
        System.out.println("集合中元素的个数" + c.size());

        // 清空集合
        c.clear();
        System.out.println("清空后的集合中的元素个数是：" + c.size());

        c.add(12);
        c.add("hello"); // "hello" 对象的地址放入到了集合之中
        c.add("world");

        // contains(Object o)
        System.out.println(c.contains(12));

        System.out.println(c.isEmpty()); // false
        c.clear();
        System.out.println(c.isEmpty()); // true

        c.add(1);
        c.add(1);
        c.add(1);
        c.add(1);
        c.add(1);

        // 将一个集合转化成为一个数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }
}
