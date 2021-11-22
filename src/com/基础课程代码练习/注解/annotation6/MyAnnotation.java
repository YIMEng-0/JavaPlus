package com.基础课程代码练习.注解.annotation6;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:11 下午
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    /**
     * 创建了两个属性，这两个属性知识可以在方法上面使用
     * @return
     */
    String username();
    String password();
}
