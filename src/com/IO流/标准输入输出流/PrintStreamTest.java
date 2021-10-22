package com.IO流.标准输入输出流;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 10:15 下午
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream 标准的输出流，输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("hello World");
        PrintStream ps = System.out;
        ps.println("h");
        ps.println("0");

        // 标准输出流是不需要关闭的

        // 改变标准输出流的输出方向
        // 标准输出流不再是指向控制台，指向了 log 文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));

        // 将输出文件修改为 log 文件
        // setOut() 设置了输出的方向，将日志输出到控制台中
        System.setOut(printStream);
        // 将输出的文件打印到日志文件中，方便日志的查阅
        System.out.println("hello World");
        System.out.println("hello China");
    }
}
