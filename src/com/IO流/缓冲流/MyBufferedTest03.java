package com.IO流.缓冲流;

import java.io.*;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 9:59 下午
 */
public class MyBufferedTest03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            // test 里面的代码的合并结果
            br = new BufferedReader(new InputStreamReader(new FileInputStream("temp.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭流
        br.close();
    }
}
