package com.注解.annotation3;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:20 下午
 */
public class MyAnnotationTest3 {
    public static void main(String[] args) {

    }

    // 因为存在了属性，在这里必须是对于属性进行赋值操作的，否则就会报错，需要注意
    // 指定属性值的操作
    // 不指定属性值的话，就是会报错的
    @MyAnnotation(value = "10",email = "456")
    public void doSome() {

    }

    // 属性名字是 value 的话，属性名字是可以不写的；
    // 当属性名字为其他的时候，就会报错，只能是 value 的时候可以省略；
    // 一个注解的属性名字是 value 的时候，属性的名字是可以省略的；
    // 只有一个 value 的时候，属性名字是可以省略的，在其他的情况之下，是不可以省略的；
    // 使用的条件是比较苛刻的；
    @MyAnnotation(value = "18",email = "123")
    public void doOther() {

    }
}
