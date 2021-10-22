package com.集合.Map集合.哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/2 10:27 下午
 */

/**
 * 向着 Map 集合中存取的时候，先调用的是 hashCode() 方法，然后调用 equals() 方法；
 * equals() 方法有可能是调用的，也有可能是不调用的；
 *      什么时候调用？
 *          put(k,v) ,什么时候是不调用equals() 方法的？
 *              k.hashCode 方法返回哈希值，哈希值经过哈希算法得到数组的下标，数组下标位置上看如果是 null 的时候， equals() 是不会执行的
 *          get(k)   ,什么时候不会调用equals() 方法？
 *              k.hashCode 方法返回哈希值，哈希值经过哈希算法得到数组的下标，数组下标位置上看如果是 null 的时候， equals() 是不会执行的
 *
 *  hashCode() 方法直接使用IDEA 自动生成即可，但是这两个方法需要同时生成
 *
 *
 * 终极结论：
 *      放在 HashMap key 集合中的元素和 HashSet 集合中的元素，需要重写 hashCode() 和 equals()
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("Jack");
        Student s2 = new Student("Jack");

        // 目前的方法还没有重写，比较是 false 因为两个不同的对象在这里
        // s1 就是 this 代表的对象， s2 是传进去的对象，两者进行内容的比较；当内容都是一样的时候，返回的是 true
        System.out.println(s1.equals(s2));  // true
        System.out.println(" s1 的hashCode 值为：  " + s1.hashCode());
        System.out.println(" s2 的hashCode 值为：  " + s2.hashCode());

        // s1 s2 是相同的，HashSet 按道理只能放一个元素
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("students 集合中的元素的个数是： " + students.size()); // 按道理是 1 ，运行结果是 2 因为没有重写 hashCode

    }
}
