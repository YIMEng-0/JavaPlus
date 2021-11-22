package com.基础课程代码练习.IO流.MyInputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 9:09 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream 类中的其他常用方法
 *      int available() // 返回流当中剩余的没有读取到的字节数量
 *      lang skip(lang n) // 跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp.txt");
            System.out.println("总字节数目： " + fis.available());

            // 读一个字节
//            int readByte = fis.read();

            // 还剩下的可以读取的字节数量是什么？
            int count = fis.available();
            System.out.println("剩余没有读取的字节数量: " + count);

            // available() 有什么作用？
            byte[] bytes = new byte[fis.available()];
            // 不需要使用循环了，直接读取一次即可
            int readCount = fis.read(bytes); // 读取的字节的数量 81
            System.out.println(new String(bytes)); // 将 byte[] 数组转换成为 字符串，进行了打印操作 // 不太是适合太大的文件，byte[] 数组不宜太大

            // skip 跳过几个方法不读取，后面可能会使用到


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