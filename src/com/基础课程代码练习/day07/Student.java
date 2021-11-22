package com.基础课程代码练习.day07;

/*
    定义一个Student类即定义了一个模板

    类属于应用数据类型 Java所有的类都是引用数据类型 不属于基本类型

    类属于引用数据类型
 */

public class Student {
    // 类体 = 属性加上方法
    // 变量定义在类体当中所以叫做成员变量
    // 每个对象的学好是不同的，需要通过对象进行访问
    // 学号信息不能通过类进行访问 需要使用对象进行访问 这种成员变量叫做：实例变量
    // 对象也叫做实例 实例变量也叫做对象变量 对象级别的变量
    // 不创建对象 no 变量的内存空间是不存在的
    int no;
    String name = "Jack";
    boolean sex;
    int age;
    String address;

    public static void main(String[] args) {
        // 创建了一个对象 示例化 stu
        // new 运算符的作用是在堆的内存空间中 开辟出来一个新的内存 将内存的首个地址赋值给 stu 所以叫做引用数据类型 这里是在堆内存中进行开辟空间
        // 方法区内存 ： 在类进行加载的时候，class 字节码文件代码片段被加载到内存空间当中
        // 方法运行的时候给方法分配的空间在栈中（）局部变量
        // new 的对象在堆内存中进行存储
        // stu 是一个局部变量 将对象在堆内存中地址在栈中进行存储
        // stu 叫做引用 不是真正的对象 这个只是引用
        // 什么是对象 ？  new 创建的 在堆内存中进行开辟的内存空间
        // 访问堆内存中东西需要进行 引用进行访问 不能直接进行操纵堆内存 引用进行访问 访问对象内部的实例变量
        // 访问实例变量的语法：
            // 引用.变量名 = 值；引用就是一个对象的地址
        Student stu = new Student();

        String stuName = stu.name;
        int stuAge = stu.age;
        boolean stuSex = stu.sex;
        String stuAddress = stu.address;
        System.out.println(" 学生的名字是: " + stuName);
        System.out.println(" 学生的年龄是: " + stuAge);

        // 指向 Java 内存中的对象
        // 对象中的实例变量需要通过对象进行访问 不能通过类明进行访问
        Student stu2 = new Student();
    }

}
