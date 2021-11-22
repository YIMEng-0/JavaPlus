package com.基础课程代码练习.IO流.MyWriter;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 8:42 下午
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用 FileReader FileWriter 只能进行文本的拷贝
 */

/**
 * 能使用记事本编辑的文件都是普通文本文件；
 * 普通文本文件与后缀是没有关系的；
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        int readCount = 0;
        char[] chars = new char[4];
        try {
            // 读
            in = new FileReader("temp.txt");

            // 写
            out = new FileWriter("OurWriter.txt");

            while ((readCount = in.read(chars)) != -1) {
                out.write(chars);
            }

            // 进行管道的清空
            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
