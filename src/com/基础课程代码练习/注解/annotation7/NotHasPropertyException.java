package com.基础课程代码练习.注解.annotation7;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:33 下午
 */

/**
 * 自定义异常
 */
public class NotHasPropertyException extends RuntimeException{
    public NotHasPropertyException(){

    }

    public NotHasPropertyException(String s){
        super(s);
    }
}
