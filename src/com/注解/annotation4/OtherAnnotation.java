package com.注解.annotation4;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:36 下午
 */
public @interface OtherAnnotation {
    /**
     *
     * @return
     */
    int age();
    String[] email();

    Season[] seasonArray();
}
