package com.MyNumber;

import java.util.Arrays;
import java.util.Random;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 2:03 下午
 */
public class 五个不重复的随机产生的数字组成的数组 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        Random random = new Random();
        int count = 0;
        while (count < array.length) {

            // 判断数组不存在这个数字那么放进去
            int num = random.nextInt(5);
            if (!contains(array, num)) {
                array[count++] = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // 单独写程序，是否在数组中包含这个元素
    public static boolean contains(int[] arr, int key) {
//        // 对数组进行排序
//        Arrays.sort(arr);
//
//        // 二分法进行查找
//        // 二分法查找的结果，找到了，返回值大于 = 0，表是存在
//        return Arrays.binarySearch(arr,key) >= 0;

        // 方案 二  ; 暴力进行遍历即可
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}