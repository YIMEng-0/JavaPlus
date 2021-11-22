package com.基础课程代码练习.IO流.标准输入输出流;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 10:23 下午
 */
public class logUtil {
    public static void log(String string) throws Exception {
        // 准备输出的对象
        PrintStream printStream = new PrintStream(new FileOutputStream("myLog.txt",true));
        // 设置输出的位置
        System.setOut(printStream);

        Date nowDate = new Date(); // 注意引入的类，有的可能是自己写的，和 Java 包中的类名字是一样的，使用了错误的类；
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(nowDate);

        System.out.println(strTime + ": " + string);
    }
}
