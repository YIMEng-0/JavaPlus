package com.基础课程代码练习.MyDate;

//import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 7:48 下午
 */
public class MyDateTest02 {
//    @Test
    public void myTime() {
        /**
         * 构造方法：无参数的表示获取系统的当前时间，
         *          有参数的将毫秒传递进去，通过毫秒获取相应的时间
         */
        Date time = new Date(1); // 传进去的参数是 1 ，也就是从 1970 01 01 00 00 00 001
        System.out.println(time);

        // 按照自己习惯的方式进行时间的定义
        // 这里输出结果是 08 因为北京是东8区，正常时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        // 获取昨天的这个时候的时间
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);

    }
}
