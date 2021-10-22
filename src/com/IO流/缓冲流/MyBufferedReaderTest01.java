package com.IO流.缓冲流;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 8:53 下午
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲流，不需要前面的字节数组以及字符数组，自己带有缓冲的；
 * 不需要自己定义的东西；
 */

/**
 * 前面的流 更快一些，这里的速度稍微慢一点儿；
 */
public class MyBufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        // 当一个流的构造方法中需要一个流的时候，被传进来的流叫做节点流
        // 外部负责包装的这个流叫做：包装流；还有叫做处理流
        // 当前的程序，FileReader 就是一个节点流，BufferedReader 就是一个处理流，或者叫包装流
        FileReader reader = new FileReader("temp.txt");
        BufferedReader br = new BufferedReader(reader);

        // 读取一行
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s); // br.readLine() 是没有换行符的，会一直在一行读一下
        }

        // 在这里只会调用 br 的close() 但是，in.close() 在源代码中也是被调用了，所有的流都被关闭了
        // 对于包装流来讲，只需要关闭外层流即可，里面的节点流是会被自动关闭的；
        br.close();
    }
}
