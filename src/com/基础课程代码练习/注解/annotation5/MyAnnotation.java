package com.基础课程代码练习.注解.annotation5;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:54 下午
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1、只允许这个注解可以标注类和方法
 * 2、希望这个方法可以使用反射进行反射
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
