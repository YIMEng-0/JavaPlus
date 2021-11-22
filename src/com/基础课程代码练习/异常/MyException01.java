package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 8:00 下午
 */

/**
 * 1、实际的开发中的业务出现的异常，是提供的 JDK 不够用，需要程序员自己进行定义异常，来解决实际中的一些问题
 * 2、java 定义异常的步骤：
 *       (1) 编写类继承 Exception 或者 RuntimeException；
 *       (2) 提供两个构造方法，一个是没有参数的，一个是带有 String 参数的；
 *
 *   按照规范写就行，就是这样子定义的
 */
public class MyException01 extends Exception { // 这是编译时异常，发生的概率是比较高的
    public MyException01() {

    }

    public MyException01(String s) {
        super(s);
    }

}

class MyException02 extends RuntimeException{ // 这里是运行时异常，发生的概率是比较低的

}
