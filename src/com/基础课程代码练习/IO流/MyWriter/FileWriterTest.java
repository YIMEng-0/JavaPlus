package com.基础课程代码练习.IO流.MyWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 8:34 下午
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // 没有文件会创建文件
            out = new FileWriter("OutReader");

            // 开始写文件
            char[] chars = {'h','e','l','l','o'};

            // 将 chars 数组全部写出去，写入到了指定的上面的文件
            out.write(chars,2,3); // 将源文件进行清空的处理，相关的索引的东西写出去

            // 进行管道的刷新，清空管道，保证文件的正常写出去
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
