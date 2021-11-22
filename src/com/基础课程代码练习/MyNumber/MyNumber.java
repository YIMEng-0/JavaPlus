package com.基础课程代码练习.MyNumber;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 1:45 下午
 */

import java.text.DecimalFormat;

/**
 *  关于数字的格式化
 */
public class MyNumber {
    public static void main(String[] args) {
        // Java 中的java.text.DecimalFormat
        // 专门负责数字的格式化
        // 使用了千分位，保留了两位小数
        DecimalFormat df = new DecimalFormat("###,###.## ");
        String s = df.format(1234.42432);
        System.out.println(s);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(22342343543.23);
        System.out.println(s2);
        /**
         * # 代表任意数字
         * ，代表千分位
         * . 代表小数点
         */


    }
}
