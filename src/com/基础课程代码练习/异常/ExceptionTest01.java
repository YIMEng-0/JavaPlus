package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 9:58 下午
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /**
         * main 方法中调用 doSome() 方法
         * doSome() 方法上面有 throws ClassNotFoundException 的异常,而且这个异常是编译时异常，必须处理的那种
         * 所以在调用的时候需要对异常进行处理；
         * 否则编译器会报错
         */
//        doSome();
    }

    /**
     * 在方法申明的位置上面进行异常抛出
     * 表示doSome() 在执行的过程当中，有可能出现 ClassNotFound 异常，叫做类没有找到的异常
     * 这个异常的直接父类就是：Exception 所以ClassNotFound 就是属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
