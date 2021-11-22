package com.基础课程代码练习.final关键字;

/**
 * final 表示不可变得 是最终的
 * <p>
 * 一般所学习的类库中，一般包括三个部分：
 * - 源代码  源代码理解程序
 * - 字节码  程序开发中的使用
 * - 帮助文档 对源代码的解释说明
 */

/**
 *      1、final 是一个关键字 表示不可变的，最终的
 *      2、final 修饰的类是无法继承的
 *      3、final 修饰的方法无法被覆盖
 *      4、final 修饰的各种变量一旦被赋值，是无法被修改的
 *      5、final 修饰的引用，一旦被指向某个对象之后，不能再指向其他的对象，指向的对象是无法被垃圾回收期所回收的
 *              指向一个对象之后，不能再指向其他的对象，但是对象内部的数据是可以进行修改的
 *      6、final 修饰的实例变量，一般与 static 进行使用 ，叫做常量， 比如：GUO_JI 中间使用连字符进行分开即可
 *      7、final 修饰的东西，不会发生变化
 */
public class finalfl {
    static final String country = "China";

    public static void main(String[] args) {
        String stu = "Hello World";


        // final 将其今进行了限制 它的值是不能被改变的
        // 一旦指向了一个对象，是不能指向其他的对象的
        final int i = 20;
    }
}
