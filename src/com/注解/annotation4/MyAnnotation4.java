package com.注解.annotation4;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:31 下午
 */

/**
 * 注解当中的属性可以是什么属性？
 *
 * @author yimeng
 */
public @interface MyAnnotation4 {
    //    Object value();
    // 数据类型可以为：byte short int long float double boolean char
    // String Class
    // 注解的数据类型可以为上面的数据类型以及，其相关的数组形式
    int value1();

    String value2();

    int[] value3();

    String[] value4();

    Season value5();

    Season[] value6();
}
