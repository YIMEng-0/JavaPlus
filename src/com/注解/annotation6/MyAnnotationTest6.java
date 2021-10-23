package com.注解.annotation6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:11 下午
 */

/**
 * 使用注解机制获取到注解里面的数值
 */
public class MyAnnotationTest6 {
    public static void main(String[] args) throws Exception {
        // 使用反射机制获取到方法上面的注解信息
        Class c = Class.forName("com.注解.annotation6.MyAnnotationTest6");

        // 获取 doSome 方法
        Method doSomeMethod = c.getDeclaredMethod("doSome");

        // 判断方法上面是否存在注解
        if (doSomeMethod.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
            System.out.println("username:" + myAnnotation.username());
            System.out.println("password:" + myAnnotation.password());
        }
    }


    @MyAnnotation(username = "Tom", password = "123")
    public void doSome() {

    }
}
