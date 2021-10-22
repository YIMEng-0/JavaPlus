package com.集合.ArrayList集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 1:39 下午
 */

/**
 * 位运算符的 >> 解释
 */
public class BinaryTest {
    public static void main(String[] args) {
        // >> 右移二进制
        // >> 1 就是除以 2
        // >> 2 就是除以 4
        // 10 的二进制表达 00001010  原始为 10，向右边移动一位：00000101 变成了 5
        // << 左边移动，在右边补 0 ；>> 右边移动，左边补 0；
        System.out.println(10 >> 1);
    }
}
