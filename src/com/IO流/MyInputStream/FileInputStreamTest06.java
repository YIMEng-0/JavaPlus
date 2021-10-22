package com.IO流.MyInputStream;

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
public class FileInputStreamTest06 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp.txt");

            // skip 跳过几个方法不读取，后面可能会使用到
            fis.skip(3);
            System.out.println(fis.read()); // 100 ,这里的读取是按照一个一个读取的，跳过了 3 个直接到了 d 就是 100 了；


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