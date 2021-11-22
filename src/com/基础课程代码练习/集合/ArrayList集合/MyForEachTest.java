package com.基础课程代码练习.集合.ArrayList集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 5:20 下午
 */

/**
 * JDK 5 之后，推出来了增强 for 循环，叫做 foreach
 */
public class MyForEachTest {
    public static void main(String[] args) {
        // 普通 for 循环
        int[] arr = {12, 232, 23, 23, 4, 545};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 增强for 循环
        // 缺点：没有下标，foreach
        // 在需要下标的时候，不推荐使用
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
