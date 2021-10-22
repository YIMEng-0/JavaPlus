package com.IO流.文件的拷贝原理;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 7:37 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 从两个盘之间进行数据的拷贝，中间需要使用内存进行处理
 * 有内存的输出以及输入；
 * 一边读的操作，一边写的操作；
 * 使用 FileInputStream FileOutputStream 实现了文件的拷贝；
 * 文件的拷贝过程应该是一边读，一边写；
 * 使用字节流进行文件的拷贝应该是万能的，什么文件都可以拷贝；
 */

/**
 * 拷贝一个文件进行的玩耍
 */
public class MyCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建了一个输入流对象
            fis = new FileInputStream("temp.txt");

            // 创建一个输出流的对象
            fos = new FileOutputStream("Output.avi");

            // 一边读取，一边写入
            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;

            // 下面的操作中，一边是进行写入的操作的，一边是进行写出的操作的
            // 无论是写入还是写出，都是需要使用 byte[] 数组的，一边进行写入，一边写出
            while ((readCount = fis.read(bytes))!= -1) {
                // 读取了多少，在这里就需要写进去多少；
                // 写的时候，也是使用了 byte[] 数组
                // 读了多少，写多少，拷贝的文件的大小是不能变化的
                fos.write(bytes,0,readCount);
            }

            // 输出流在最后需要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 流关闭，分开关闭流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // 流关闭
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
