package com.工具类的使用;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/16 6:03 下午
 */

/**
 * java.lang.String 学习
 *  1、String 是引用数据类型，"abc" 都是 String 的对象，不是基本的数据类型
 *  2、Java 里面双引号引出的东西是不可以改变的，不可变，不能修改
 *  3、 String 创建出来的东西是放在 "字符串常量池里面的"
 *  4、为什么把字符串存储在字符串常量池当中呢？
 *      因为String 使用非常频繁，为了考虑到开发效率所以放在了方法区的字符串了常量池中
 *      String 类型的数据在实际中，经常性的
 *  5、使用字符串的时候，使用 String 创建出来的对象，在堆中保存的是字符串的引用，真实的字符串的值保存在字符串常量池中
 *     栈中的引用保存堆中的地址，堆中的对象保存字符串常量池中的真实字符串
 */

/**
 * 凡事双引号括起来的，都在字符串常量池中有一份
 * new 对象的时候一定在堆内存中创建对象，开辟空间
 */

/**
 * 上面的两个东西是不冲突的，使用了 new 就是在堆中开辟空间，使用了 String a = "as"; 就是在常量池中开辟空间
 */
public class MyString {
    public static void main(String[] args) {
        // 这个下面的比较的是 false 创建了不同的对象，引用的地址是不同的
        // 在堆中有常量池的引用
//        String s1 = new String("a");
//        String s2 = new String("a");

        // 直接在常量池中进行保存，所以显示的 true 不会创建新的对象，指向的内存地址是一样的
        // == 比较的是变量中的内存地址 true
        // 直接在常量池的引用，堆中没有对象
        String s1 = "abcd";
        String s2 = "abcd" + "ef";


        System.out.println(s1 == s2);

        String s3 = "a" + "b" + "c";

        String s4 = new String("d");
    }
}