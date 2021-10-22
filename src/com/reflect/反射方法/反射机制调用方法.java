package com.reflect.反射方法;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 9:31 下午
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 使用反射机制进行对象的方法的调用
 *      使用了反射机制，可以使得程序变得灵活一点儿；
 *      只是需要修改配置文件，可以实现程序的使用，不需要进行程序的改动；
 *      可以创建出来不同的对象，调用不同的对象的不同的方法，实现了框架的重复使用性；
 *
 *      变化的内容放在了配置文件中，修改了配置文件知乎，创建出来的对象就变成了不同的东西，调用的方法也变得不一样，
 *      实现了方法的重复使用，代码不需要继续改动；
 */
public class 反射机制调用方法 {
    public static void main(String[] args) throws Exception {
        // 不使用反射的时候，进行的方法的调用：
        // 先创建出来对象，使用对象进行方法的调用

        // 使用反射机制的相关调用方法的实现：
        Class userService = Class.forName("com.reflect.反射方法.service.UserService");

        // 创建对象
        Object obj = userService.newInstance();
        // 获取 method()
        // 单单获取方法的名字是不合适的，因为 Java 中是可以进行方法的重载的，
        // Java 区分方法是使用了方法名字以及参数的列表

        // 获取Method()
        Method loginMethod = userService.getDeclaredMethod("login", String.class, String.class);

        /**
         * 调用方法的要素分析
         *  1、对象
         *  2、login 方法
         *  3、实际参数列表
         *  4、返回值
         *
         *      反射机制同种的四个要素也是需要的；
         *      invoke() 调用的意思
         */
        // 翻译：调用loginMethod的方法，把（admin,123） 传递进去，实现了方法的调用
        /**
         * loginMethod 是方法
         * obj 是对象
         * "admin"，"123" 是实际参数
         * retValue 是返回值
         */
        Object resValue = loginMethod.invoke(obj, "admin", "123"); // 调用方法的时候，把两个 String 进行传递进去
        System.out.println(resValue);
    }
}
