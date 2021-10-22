package com.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 5:23 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于 try catch 中的 finally 语句
 * finally 中的语句块是最后执行的，并且是一定会执行的，即使 try 语句块中的代码出现了异常，也是会执行的；
 * finally 子句必须和 try 一起出现，不能单独编写
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建输入流对象
            fis = new FileInputStream("  ");

            String s = null;
            s.toString();

            // 流在使用结束后，需要关闭，因为它会占用资源
            // 流的前面发生了异常，下面的语句不会执行，流就不会被关闭

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hello Hack!");
            // 流的关闭放在在这里比较安全，因为一定会执行
            if (fis != null) { // 避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("流被关闭了");
            }
            System.out.println("这是 finally 最后执行的代码块");
        }
    }
}