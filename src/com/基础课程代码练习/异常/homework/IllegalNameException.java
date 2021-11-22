package com.基础课程代码练习.异常.homework;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 8:31 下午
 */
public class IllegalNameException extends Exception {
    public IllegalNameException() {

    }

    public IllegalNameException(String s) {
        super(s); // 不可缺少，从源代码的阅读中来看
    }
}
