package com.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 2:53 下午
 */

/**
 *      Integer 构造方法有两个：
 *          Integer(int);
 *          Integer(String)
 */
public class Integer构造方法 {
    public static void main(String[] args) {

        // 下面使用了删除线，表示此构造方法已经过时了，
//        Integer integer = new Integer(111);

        System.out.println("int 的最大值" + Integer.MAX_VALUE);
        System.out.println("int 的最小值" + Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // 自动装箱
        Integer integer = 202;

        // 自动拆箱
        // 不同的数据类型，选择不同的拆箱工具，进行拆箱的工作，
        int i = integer.intValue();
    }
}