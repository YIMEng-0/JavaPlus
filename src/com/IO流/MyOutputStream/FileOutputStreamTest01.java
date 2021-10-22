package com.IO流.MyOutputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 7:18 下午
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 文件不存在的时候，进行文件的新建；
            // 这种方式会将源文件进行清空，然后开始写入；需要谨慎使用
            // 使用追加的方式在原来文件的后面进行输出，不会删除原来的文件的内容;在源文件中追加 true ，可以在后面进行追加；
            fos = new FileOutputStream("myfile.txt");

            // 开始写出
            byte[] bytes = {97,98,99,100,101,102};

            // 将byte[] 数组中的所有元素写出
            fos.write(bytes);

            // 将 byte[] 数组的部分进行写出
            fos.write(bytes,0,2); // 从 0 开始长度是 2

            String s1 = "hello world";
            byte[] bytes1 = s1.getBytes();

            // 写入的时候，将 bytes[] 进行传入即可
            fos.write(bytes1);



            // 书写完成，进行刷新，将管道里面的东西进行清空
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
