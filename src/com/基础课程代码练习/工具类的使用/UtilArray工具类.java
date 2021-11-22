package com.基础课程代码练习.工具类的使用;/**
 * @author  LuoBin
 * @date  2021/9/16 4:47 下午
 * @version 1.0
 */

import java.util.Arrays;
/**
 * 使用了二分法查找，使用二进制查找
 */
public class UtilArray工具类 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,7,8,8,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 二分法查找
        int index = Arrays.binarySearch(arr,5);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是 ：" + index);
    }
}
