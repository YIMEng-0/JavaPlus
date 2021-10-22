package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/23 9:39 下午
 */
// 深入理解 try catch

/**
 * 1、catch 后面的小括号是可以为具体的异常类型，也可以是异常的父类型
 * 2、catch 可以书写多个，建议精确处理异常，有利于程序的调试
 * 3、catch 后面的异常，需要从小到大，否则会报错，在写了多个异常的时候，需要这样子处理
 */

/**
 * 在 JDK8 的新特性中允许同时捕捉多个异常，中间使用 ｜ 进行分隔开来
 */
public class ExceptionTest07 {
//    public static void main(String[] args) throws Exception, FileNotFoundException,NullPointerException {
//
//    }

    public static void main(String[] args) {
        // 随便获取一个文件路径
        // 不处理异常会报错
        // 快捷键 option command t 快速生成：try catch
        try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("");

            // 读文件
            fis.read();
        } catch (FileNotFoundException e) { // 父类型的引用可以指向子类
            // catch 可以写确切当前的数据类型，也可以写其父类型
            // 精确的异常需要精确处理，当然可以直接使用 Exception 进行异常的捕捉，
            System.out.println("文件不存在！！！");
        } catch (IOException e) {             // 同时写多个异常

        }
    }
}
