package com.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 11:02 上午
 */

/**
 * 可变长度方法的参数个数：
 * 要求是 0 个或者 n 个；
 * 可变长度参数在列表中只能有一个，并且可变长度的参数在列表中的最后的位置;
 * 必须在最后面，只能有一个
 */
public class 可变长度参数 {
    public static void main(String[] args) {
        m(1, 2, 3, 6, 4, 5);
        m(1);
        m(1, 3);

        String[] strings = {"a", "b", "c"};

        // 将数组进行传递进去
        m1(strings);
    }

    // 这个就是可变长参数
    public static void m(int e, int... args) {
        // 传进来的 args 是一个数组，可以进行遍历的操作
        // 可以将可变长度参数当作一个数字来看待
        System.out.print("参数的长度是：" + args.length);
        System.out.println("   可变长度参数执行了");
    }

    public static void m1(String... args) {
        System.out.print("m1 参数的长度是：" + args.length);
        System.out.println("   可变长度参数执行了");
    }
}
