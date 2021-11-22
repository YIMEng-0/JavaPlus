package com.基础课程代码练习.IO流.MyInputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 8:27 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)
 * 一次进行多个字节的读取，读取 b.length() 个字节；
 * 减少内存和硬盘之间的交互，提高程序的执行执行效率；
 * 在byte[] 数组中读取
 */

/**
 * 默认的文件的路径是 java 工程的根目录，不然可能会出现文件找不到的错误；
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // IDEA 默认的当前文件的路径是在哪儿？
            // 在工程Project 的根就是 IDEA 的默认当前路径
            // 就是需要将文件保存在工程的根目录文件中，就是一进去工程的那个工程文件中；
            // 如果把文件放在了其他的子目录中，自己需要加上去绝对路径；
            fis = new FileInputStream("temp.txt");

            // 开始读取字节，一次采用多个字节，最多读取 数组.length 个字节
            byte[] bytes = new byte[4]; // 准备一个长度是 4 的数组，一次最多读取 4 个字节就放满了；

            int readCount = fis.read(bytes);        // 返回值是：读取到的字节数量，不是字节本身；
            System.out.println(readCount);          // 第一次读到了四个字节
            System.out.println(new String(bytes));  // 将byte[] 数组转换成为了 字符串的形式 abcd ； 将字节数组全部转换成为字符串
            // 不应该是全部转换，应该是读取多少，转换多少；打印输出的是数组中的内容，不是 readCount ，将 byte[] 数组中的值打印出来即可
            System.out.println(new String(bytes, 0, readCount));

            readCount = fis.read(bytes);     // 第二次只能读取到 2 个字符
            System.out.println(readCount);   // 2
            System.out.println(new String(bytes));     // efcd 前面的 ab 会被覆盖掉的，这里需要注意，直接拿过去覆盖掉
            System.out.println(new String(bytes, 0, readCount)); // 读取多少字节，读取了什么字节，在后面就转换成为什么字节
            // 读取多少，转换多少，没有读取的先不转换；

            readCount = fis.read(bytes);
            System.out.println(readCount);  // -1  因为已经读取不到了，该读取的东西都读取结束了

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
