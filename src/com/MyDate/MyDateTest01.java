package com.MyDate;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 7:31 下午
 */
public class MyDateTest01 {
    public static void main(String[] args) {
        // 获取时间戳，从 1970 年 01 01 00 00 00 000 到现在的毫秒数目
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "毫秒");

        /**
         * 统计程序的运行时间，通过记录毫秒进行计算
         * 执行前，执行后，分别记录即可
         */
    }

    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
