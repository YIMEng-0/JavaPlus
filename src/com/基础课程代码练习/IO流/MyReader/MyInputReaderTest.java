package com.基础课程代码练习.IO流.MyReader;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 8:13 下午
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 按照字节进行的输入以及输出，使用的是字节数组；
 * 下面的按照字符的输入以及输出，使用的是字符数组，
 *      FileReader:
 *          是文件的输入流，只能读取文本，按照一个字符一个字符的进行读取的操作，比较方便快捷，文本专门准备的；
 */
public class MyInputReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // 创建文件字符输入流
            reader = new FileReader("temp.txt");

            // 开始读取
            char[] chars = new char[10]; // 一次读取 4 个字符

            // 将 chars 数组进行读取，读取之后，直接保存在了 chars 数组里面
            reader.read(chars); // 上面定义了100 只能读 100 个，数组中前面的前一百个东西

//            for (char ch : chars) {
//                System.out.println(ch);
//            }
//
            int readCount = 0;

            while ((readCount = reader.read(chars))!= -1) {
                // 读取多少显示多少
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
