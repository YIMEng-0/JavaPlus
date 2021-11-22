package com.基础课程代码练习.注解.annotation2;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:06 下午
 */
public @interface MyAnnotation {
    /**
     * 这个是注解中的属性，注解中可以定义属性；
     * 下面是Annotation 的属性，看着像是一个方法，实际上是一个方法；
     * @return
     */
    String name();
    String color()default "RED";
    int age()default 18; // 属性指定默认值，在 Test里面是可以不加默认值的；
}
