package com.IO流.缓冲流;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 9:11 下午
 */

import java.io.*;

/**
 * BufferedReader
 *      这里是一个转化流
 */
public class MyBufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("temp.txt");

        // 下面的构造方法中只能传递一个字符流，但是上面定义的是一个字节流，需要处理，使用了转换流，字节流转换成为了字符流

        // 通过转换流进行转换 将字节流转换为字符流
        // 此时的 in 叫做节点流，reader 是包装流
        InputStreamReader reader = new InputStreamReader(in);

        // 流转换了之后，可以进行正常的使用了
        // 这里的reader 是节点流
        // br 是包装流，都是有着一定的相对性的，这里是包装，可能下面就是节点；这里是节点，可能下面就是包装流了；需要进行鉴别
        BufferedReader br = new BufferedReader(reader);
    }
}