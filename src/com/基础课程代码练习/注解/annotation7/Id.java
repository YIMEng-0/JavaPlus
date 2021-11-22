package com.基础课程代码练习.注解.annotation7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:24 下午
 */

// 表示这个注解只能出现在类的上面
@Target(ElementType.TYPE)
// 注解可以使用反射机制读取到的
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {

}
