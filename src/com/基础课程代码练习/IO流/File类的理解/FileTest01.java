package com.基础课程代码练习.IO流.File类的理解;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 10:40 下午
 */

import java.io.File;
import java.io.IOException;

/**
 * File 类和四大家族没有关系，不能读写
 *      是文件以及文件路径的抽象表现形式；文件是一个 File ，也可能是一个目录
 *
 * File 类中的常用方法掌握：
 *
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("testFile");

        System.out.println(f1.exists());

//        if (!f1.exists()) { // 文件不存在
//            f1.createNewFile(); // 创建新的文件
//        }

        if (!f1.exists()) {
            f1.mkdir();     // 使用了目录的形式创建出来的 File
        }
    }
}
