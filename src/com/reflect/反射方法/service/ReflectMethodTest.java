package com.reflect.反射方法.service;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 11:24 上午
 */
public class ReflectMethodTest {
    public static void main(String[] args) {
        try {
            // 获取类
            Class userServiceClass = Class.forName("com.reflect.反射方法.service.UserService");

            // 获取所有的 Method
            Method[] methods = userServiceClass.getDeclaredMethods(); // 获取到了所有的已经申明的方法
            System.out.println(methods.length); // 2

            // 进行方法的遍历操作
            for (Method method : methods) {
                // 获取修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));

                // 获取方法的返回值类型
                System.out.println(method.getReturnType().getSimpleName());

                // 获取方法的名字
                System.out.println(method.getName());

                // 方法的参数的修饰符列表
                Class[] parameterTypes = method.getParameterTypes(); // 因为一个方法可有有多个参数，所以在这里表示为是一个数组；数组的长度可能为 0
                for (Class para : parameterTypes) {
                    System.out.println(para.getSimpleName());
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}