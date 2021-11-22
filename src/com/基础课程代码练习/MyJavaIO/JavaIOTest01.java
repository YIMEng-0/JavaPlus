package com.基础课程代码练习.MyJavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/14 2:10 下午
 */


public class JavaIOTest01 {
    public static void main(String[] args) throws IOException {
        char c;
        // 使用 System.in 创建 BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下 'q'进行退出");

        // 字符读取
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}