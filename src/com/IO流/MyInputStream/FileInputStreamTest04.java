package com.IO流.MyInputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 8:56 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 对前面的程序进行整合，形成一个比较合适的程序；
 * 达到最终版本
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp.txt");

            // 准备一个 byte[] 数组
            byte[] bytes = new byte[4];
//            while (true) {
//                int readCount = fis.read(bytes);
//                if (readCount == -1) {
//                    break;
//                }
//                // 读取到多少个字符，将读取到的字符进行字符串化
//                // 把 byte[] 数组转换成为字符串，读取多少，转换多少
//                System.out.print(new String(bytes, 0, readCount)); // 将读取到的字节进行打印输出
//            }

            // while 循环的重新整合
            int readCount = 0;
            while ((readCount = fis.read(bytes))!= -1) {
                System.out.print(new String(bytes,0,readCount));
            }

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