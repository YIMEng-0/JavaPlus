package com.基础课程代码练习.reflect;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/15 6:11 下午
 */

/**
 * 获取 Class 实例的三种方式：
 *      1、class c = Class.forName() ("完整的类名字带着包的名字")
 *      2、Class c = 引用.getClass() ("通过引用获取到Class")
 *      3、Java 语言中的任何一种类型，包括基本数据类型，它都是有 .class 属性的；
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /**
         * 操作一个类中的字节码文件，首先需要获取到类的字节码文件，怎么获取 java.lang.Class 的实例？
         *      Class.forName() 特点：
         *          1、需要是静态方法
         *          2、方法的参数是一个字符串
         *          3、字符串需要是一个完整类名
         *          4、完整的类名字是必须包括包的名字的；
         */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");  // c1 代表 String.class 文件 ，或者说c1 代表 String 类型

            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.System");
            System.out.println(c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 2、java 中的任何一个对象都是拥有一个方法；getClass()
         *
         */

        String s = "abc";
        Class x = s.getClass(); // x 表示的是String.Class 字节码文件，x 代表 String 类型
        System.out.println(c1 == x); // true 表示两个里面保存的内存地址是一样的，字节码文件装进去的时候内存地址是一样的；
        // c1 和 x 指向的字节码文件在方法区中是一样的，内存地址也是一样的；

        Date time = new Date();
        Class y =  time.getClass();
        System.out.println(y); // java.util.Date


        Class k = Data.class;
        System.out.println(k);

        Class f = int.class;
        System.out.println(f);

        Class g = double.class; // 返回相应的数据类型
        System.out.println(g);
    }
}
