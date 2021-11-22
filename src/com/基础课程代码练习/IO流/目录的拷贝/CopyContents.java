package com.基础课程代码练习.IO流.目录的拷贝;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/7 9:46 上午
 */

import java.io.*;

/**
 * 实现目录的拷贝
 */
public class CopyContents {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("src");

        // 拷贝目标
        File desFile = new File("/Users/yimeng/Desktop/TempCopy");

        // 调用拷贝方法
        copyDir(srcFile, desFile);
    }

    /**
     * 如何实现？
     * 进行文件的拷贝
     *
     * @param srcFile 拷贝源
     * @param desFile 贝目标
     */
    private static void copyDir(File srcFile, File desFile) {

        // 获取源下面的子目录
        File[] files = srcFile.listFiles(); // File 数组返回，子目录


        if (srcFile.isFile()) { // 得到的是文件类型，递归结束
            return;
        }

        for (File file : files) {
            // file 取出来的东西，可能是一个目录，也有可能是一个文件，是一个 File 对象

            // 获取所有文件的（包括目录和文件）的绝对路径
            System.out.println(file.getAbsoluteFile()); // 测试代码
            if (file.isDirectory()) {

                FileInputStream in = null;
                FileOutputStream out = null;
                String srcDir = file.getAbsolutePath();
                try {
                    in = new FileInputStream(srcFile);

                    String path = desFile.getAbsolutePath() + srcDir.substring(34);
                    out = new FileOutputStream(path);

                    byte[] bytes = new byte[1024 * 1024];

                    int readCount = 0;
                    while ((readCount = in.read(bytes))!= -1) {
                        out.write(bytes,0,readCount);
                    }

                    // 清空
                    out.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
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

                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }


                // 新建对应目录
//                System.out.println(srcDir.substring(3)); // 为了截取掉盘符
                // 源目录

                String dexDir = desFile.getAbsolutePath() + srcDir.substring(34); // 进行目标盘符的拼接
                System.out.println(dexDir);
                File newFile = new File(dexDir);

                if (!newFile.exists()) { // 文件夹不存在的话，将文件夹创建出来即可，床架多层目录
                    newFile.mkdirs();
                }
            }

            // 进行递归的调用
            copyDir(file, desFile); // 遍历所有的文件，进行找目录，创建目录，复制文件的操作
        }
    }
}
