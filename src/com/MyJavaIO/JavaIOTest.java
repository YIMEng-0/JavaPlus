package com.MyJavaIO;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/14 11:09 上午
 */
public class JavaIOTest {
    public static void main(String[] args) throws IOException {
        char c;

        // 使用 System.in 创建 BufferReader

        // 整体意思就是用InputStreamReader这个中介把System.in这个字节流转换成字符流BufferedReader
        // 这样输入的时候就可以不是一个一个字节读，而是一个一个字符读，再加上是个Buffer，效率会高很多
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'进行退出！");

        // 读取字符的操作
        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }
}