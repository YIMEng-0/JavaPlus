package com.IO流.MyInputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 8:15 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对第一个程序进行改进，使用循环的方式：
 *
 * 分析下面写的程序的缺点：
 *      一次读取一个字节，内存和硬盘交互太频繁，会造成资源的浪费；
 *      需要使用一次读取多个字节，减少内存的消耗，提高程序的运行效率；
 */


public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/yimeng/Desktop/IO/temp.txt");
//            while (true) {
//                int readData = fis.read();
//                if (readData == -1) { // 程序在这里是 -1 的时候，说明文件已经读取到了结尾的部分了，可以终止程序
//                    break;
//                }
//                System.out.println(readData);
//            }

            // 改造 while
            int readData = 0;
            while ((readData = fis.read()) != -1) { // 读取的文件，不是 -1 的时候，说明还能读取字符
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在程序的最后将流关闭即可
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
