package com.基础课程代码练习.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/18 7:19 下午
 */

/**
 * class.forName() 发生了什么？
 *      Class.forName() 在类加载的时候会执行，如果只是想让类中的静态代码块在执行的时候被加载，使用下面的forName 就可以了；
 *      对于只想让静态代码块执行可以使用；
 *      这个方法执行的时候，会导致类加载，静态代码的执行
 *
 *      JDBC 的技术需要使用
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            // 进行类的加载，在类加载的时候，静态代码块是会开始执行的；
            Class.forName("com.基础课程代码练习.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    // 静态代码块在类加载的时候执行，并且是只会执行一次的，
    static {
        System.out.println("MyClass 里面的静态代码块执行了");
    }
}