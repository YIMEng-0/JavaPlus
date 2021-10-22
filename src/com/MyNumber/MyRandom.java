package com.MyNumber;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 1:56 下午
 */

import java.util.Random;

/**
 * 随机数
 */
public class MyRandom {
    public static void main(String[] args) {
        // 创建随机数对象，
        Random random = new Random();

        // 随机的产生一个 int 数据类型的数字
        int i = random.nextInt();
        System.out.println(i);

        // 产生【0，100】 之间的任意一个随机数，不会产生 101
        // nextInt 表示下一个 int 数据类型是 101 表示只能取到 100，不包括 101
        int i2 = random.nextInt(101);
        System.out.println(i2);
    }
}
