package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 7:48 下午
 */

/**
 * final finally finalize
 *      final 是一个关键字，表示最终的不改变的；
 *      finally 在 try catch 中进行最后的语句的执行；
 *      finalize 是 JVM 垃圾回收器里面的东西
 */
public class ExceptionTest15 {
    public static void main(String[] args) {
        final int i = 20;
//        i = 30; final 是一个关键字，修饰的变量表示最终的，不变的


        // finally 是一个关键字，与 try 进行联合使用，使用在异常处理机制中
        // finally 在语句块中是一定会执行的
        try{

        }finally {
            System.out.println("这是 finally 中的语句块");
        }

        // finalize() Object 类中的一个方法，作为方法的名字出现
        // finalize 是一个标识符号
        Object obj;
    }
}
