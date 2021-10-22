package com.MyDate;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 7:08 下午
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java 对时间的处理
 */
public class MyData {
    public static void main(String[] args) throws ParseException {
        Date nowTime = new Date();
        System.out.println(nowTime);

        // 日期格式化
        // 将 Date 日期进行格式化
        // java.text 包下面的文件，转梦负责将日期进行格式化的操作

        /**
         * yyyy
         * MM
         * dd
         * HH
         * mm
         * ss
         * SSS
         * 除了上面的东西不能变之外，其他的东西在中间都是可以变化的
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
        String nowTimeFormat = simpleDateFormat.format(nowTime);
        System.out.println(nowTimeFormat);

        // 假设有一个日期字符串，怎么转换为 Date 类型？
        // 解析的东西和 SimpleDateFormat 定义的字符串需要是相同的，否则出现解析异常ParseException
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time); // parse 解析
        System.out.println(dateTime);  // 将一个字符串转换成为Date 类型，就是 Java 自带的默认的时间打印格式
    }
}
