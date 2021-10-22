package com.IO流.File类的理解;

import java.io.File;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/7 9:41 上午
 */
public class FileTest03 {
    public static void main(String[] args) {
        // listFiles 获取当前目录下面的所有子目录
        File f1 = new File("src/com");

        File[] myFile = f1.listFiles();
        for (File file : myFile) {
            // 获取到了文件下面的自文件，目录或者文件的名字
            System.out.println(file);
        }
    }
}
