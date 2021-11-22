package com.基础课程代码练习.注解.annotation5;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:00 下午
 */
public class ReflectAnnotation {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.基础课程代码练习.注解.annotation5.MyAnnotationTest5");

        // 判断类上面是否存在 @MyAnnotation 注解
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));

        // 判断 String 类上面是否存在着 MyAnnotation
        Class string = Class.forName("java.lang.String");
        System.out.println(string.isAnnotationPresent(MyAnnotation.class));

        if (c.isAnnotationPresent(MyAnnotation.class)) {
            // 获取注解对象
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象为：" + myAnnotation);

            // 获取注解对象的属性的操作方式，与调用接口的方式是一样的；
        }
    }
}
