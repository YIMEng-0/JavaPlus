package com.基础课程代码练习.注解;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:44 下午
 */
public class 需要了解的知识点 {
    /**
     * 注解@Retention可以用来修饰注解，是注解的注解，称为元注解;
     *
     *  Retention注解有一个属性value，是RetentionPolicy类型的，Enum RetentionPolicy是一个枚举类型，
     *  这个枚举决定了Retention注解应该如何去保持，也可理解为Rentention 搭配 RententionPolicy使用;
     *
     *  RetentionPolicy有3个值：CLASS  RUNTIME   SOURCE
     *
     *  按生命周期来划分可分为3类：
     *      1、RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
     *      2、RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；
     *      3、RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
     * 这3个生命周期分别对应于：Java源文件(.java文件) ---> .class文件 ---> 内存中的字节码。
     */
}
