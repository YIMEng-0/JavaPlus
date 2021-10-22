package com.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 3:45 下午
 */

/**
 * 常见的异常总结：
 * 空指针异常：NullPointException
 * 类型转换异常：ClassCastException
 * 数组下标越界异常：IndexOutOfBoundException
 * 数字格式化异常：NumFormatException
 */

public class Integer常用方法 {
    public static void main(String[] args) {
//        Integer integer = new Integer("你好");

        // parseInt(String s)
        // 静态方法，传入参数 String 返回 int
        // 字符串转换为 int
        // 在项目中，有的地方输入保存的东西是String 但是在 数据库中保存的是 int ，所以Java 开发的时候可以使用这个 parseInt()
        // 传字符串， 输出 int
        int reValue = Integer.parseInt("123"); // "中文" 出现 数字格式化异常
        double reValue1 = Double.parseDouble("1234");

        // 字符串转换为 数字
        System.out.println(reValue1);

        float reValue3 = Float.parseFloat("4345");
        System.out.println(reValue3);
    }
}
