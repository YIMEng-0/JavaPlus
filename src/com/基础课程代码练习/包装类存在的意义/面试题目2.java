package com.基础课程代码练习.包装类存在的意义;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/20 3:28 下午
 */
public class 面试题目2 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // false

        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d); // true

        //  == 永远都判断是两个对象的内存地址地址是否相同
        // 下面的 c == d 表现为 true 的原因就是，创建出来的引用是直接从整数型常量池中取出来的
        // Integer 在类加载的时候，会将 256 个 Integer 对象全部构建出来，是 -128，127
        // 初始化整数型常量池
        // 池 说白了就是缓存，提前准备好一些东西，需要的时候，直接拿出来用就行，提高了程序的运行效率，方便

        // 缓存的优点：效率高
        // 缺点：占用的内存空间比较大

        // 缓存机制：大型项目的优化机制，使用缓存 cache

        /**
         * 执行结果分析：
         *      在 Java 中，为了使得程序的运行效率提高，将[-128,127] 之间的所有包装类对象提前创建好，放到了方法区的"整数型常量池中"
         *      目的就是这个区间的常量不需要使用 new 进行创建，直接从整数型常量池中拿来使用
         */
    }
}
