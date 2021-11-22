package com.基础课程代码练习.reflect.反射属性;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/20 9:21 下午
 */

import java.lang.reflect.Field;

/**
 * 使用反射的机制访问一个Java对象的属性，
 *      进行属性的复制操作；
 *      获取属性的值的操作；
 */

/**
 * 反射机制可以使得代码变得复杂了一点儿，但是可以使得编写代码变得灵活
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        // 不实用反射机制的话，如何获取到属性的值？
        // 创建对象，使用对象进行调用即可

        // 使用反射机制访问一个对象的属性（set get）
        // 找到类的字节码文件，使用类的字节码文件，创建出来对象
        Class studentClass = Class.forName("com.基础课程代码练习.reflect.反射属性.Student");
        Object obj = studentClass.newInstance(); // obj 就是 Student 对象

        // 获取属性，属性之间的区分，获取属性根据名字进行区分
        // 获取的时候，将属性的名字传递进去即可
        // 获取到类的属性，获取到类指定的属性
        Field noField = studentClass.getDeclaredField("no");

        // 得到了属性之后，给予 obj 对象进行赋值操作
        // 在进行属性的赋值操作的时候，使用具体的对象赋值，也就是把值赋给了具体的对象
        noField.set(obj,111); // 给 obj 对象的 no属性赋值为：111

        // 读取属性的值
        System.out.println(noField.get(obj)); // 111

        System.out.println(noField); // public int com.基础课程代码练习.reflect.反射属性.Student.no

        // 测试：可以访问私有的属性吗？
        Field nameField = studentClass.getDeclaredField("name");

        // 打破封装
        // 反射机制的缺点，可以使得不法分子进行相关的篡改，打破了封装之后，在外面的东西也是可以对此进行访问的
        nameField.setAccessible(true);

        nameField.set(obj,"Jack");

         // 获取name 属性的值
        System.out.println(nameField.get(obj));
    }
}