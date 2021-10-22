package com.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 2:26 下午
 */

/**
 * java 中给 8 种基本类型准备了包装类，包装类是引用数据类型，父类是 Object
 * 思考？什么使用包装类？
 */
public class MyInteger {
    public static void main(String[] args) {
        // 再调用下面的 doSome() 的时候，需要传递的参数是对象，但是想传递一个数字进去，此时将 int 包装成为 Integer 对象，就可以使用相关的方法了
        Integer num = 99;
        MyInteger.doSome(num);


    }

    public static void doSome(Object obj) {

    }
}
