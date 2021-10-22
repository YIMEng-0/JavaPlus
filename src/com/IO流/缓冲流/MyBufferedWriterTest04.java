package com.IO流.缓冲流;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 10:03 下午
 */

import java.io.*;

/**
 * BufferedWriter 带有缓冲的字符输出流
 */
public class MyBufferedWriterTest04 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp.txt"));
        bufferedWriter.write("hello world");
        bufferedWriter.write("\n");
        bufferedWriter.write("hello kity");

        bufferedWriter.flush();
    }
}
