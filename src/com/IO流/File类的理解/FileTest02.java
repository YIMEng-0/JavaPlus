package com.IO流.File类的理解;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/7 9:33 上午
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File 类的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("temp.txt");
        System.out.println("文件的名字是： " + f1.getName()); // 获取文件名字的

        // 判断是否是一个目录？
        System.out.println(f1.isDirectory()); // false
        System.out.println(f1.isFile()); // true

        // 返回的是毫秒，是时间戳
        Date time = new Date(f1.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        String myTime = sdf.format(time);
        System.out.println(myTime);

        System.out.println(f1.length()); // 22 字节 获取文件的大小


    }
}
