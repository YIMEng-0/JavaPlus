package com.注解.annotation2;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:07 下午
 */
public class MyAnnotationTest {
    public static void main(String[] args) {

    }

    /**
     * 如果在注解中具有属性值，那么是必须给属性进行赋值的操作的
     */
    // 在前面是属性值，在后面是名字，因为是String 类型的，所以使用的是"jack"
    // 指定属性值即可
    // 在注解中写的是具有默认值得，所以在这不指定注解的值也是可以的；
    @MyAnnotation(name = "jack",color = "red")
    public void doSome() {

    }
}
