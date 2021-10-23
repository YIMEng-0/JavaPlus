package com.注解;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 10:20 下午
 */

import java.security.PublicKey;

/**
 * Annotation
 *      注解或者叫做注释的意思；
 *      是一种引用数据类型，编译之后为 xxx.class 文件；
 *      如何自定义注解？
 *      [修饰符列表] @interface 注解类型名字{
 *
 *      }
 */

/**
 * 什么是元注解？
 *      用来标注“注解类型” 的 “注解” 叫做元注解
 *          Target
 *              元注解，用来标注 “注解类型” 的 “注解”
 *              出现的位置：
 *                  @Target(ElementType.METHOD):表示 注解只能出现在方法的位置上面，修饰的注解只能出现在方法的上面
 *          Retention
 *                  是一个元注解，用来标注 “被标注的注解” ，
 *                  注解下面的注解保存在什么位置上面
 *                  @Retention(RetentionPolicy.SOURCE) 表示该注解只能保留在 Java 源文件中
 *
 */
@MyAnnotation
public class AnnotationTest01 {
    
}
