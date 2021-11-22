package com.基础课程代码练习.IO流.MyInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  java.io.FileInputStream （万能流）什么文件都可以读取
 *      1、字节输入流，完成输入的操作，从硬盘到内存的操作
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        // 创建文件字节输入流对象
        try {
            fis = new FileInputStream("/Users/yimeng/Desktop/IO/temp.txt");

            // 开始读
            int readData1 = fis.read();      // 返回的是：读取到的 "字节" 本身
            System.out.println("读取的文件结果： " + readData1); // 97 读取到了字节

            int readData2 = fis.read();
            System.out.println("读取的文件结果： " + readData2);

            int readData3 = fis.read();
            System.out.println("读取的文件结果： " + readData3);

            int readData4 = fis.read();
            System.out.println("读取的文件结果： " + readData4);

            int readData5 = fis.read();
            System.out.println("读取的文件结果： " + readData5);

            int readData6 = fis.read();
            System.out.println("读取的文件结果： " + readData6);


            // 读到这里，读取结束，后续的返回值将会是 -1
            int readData7 = fis.read();
            System.out.println("读取的文件结果： " + readData7);

            int readData8 = fis.read();
            System.out.println("读取的文件结果： " + readData8);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 确保流的关闭，关闭流的前提是流不是空，流是 null 的时候是没有必要关闭的
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
