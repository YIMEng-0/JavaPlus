package Java课程作业.考试题目练习.按照要求解答下列问题.泛型方法比较大小;

/**
 * @author Doraemon
 * @date 2021/12/22 6:59 下午
 * @version 1.0
 */

/**
 * 原始题目
 *
 * 设计一个泛型方法sort1()，传入一个实现了Comparable接口的类的数组，将数组中的元素按从大到小重新排序，方法的签名已经给出。
 * 写一个main方法对sort1进行简单测试。
 *       （Design a generic method sort1(), pass in an array of class that implement the Comparable interface,
 *        reorder the elements of the array from the largest to the smallest, and the method's head is given.
 *        Write a main method for a simple test of sort1.）
 */


// 知识回顾

/**
 * 设计的排序方法 1
 * @param ts    传递进去的数字数组
 * @param <T>
 *
 *     T... ts 表示同时可以传入多个不确定参数;具体是多少个，根据调用的那边确定
 *     <T extends Comparable<T>> 表示传进来的泛型数据可以是 Comparable
 */

/**
 * 泛型方法
 *      必须在返回值前边加一个<T>，来声明这是一个泛型方法，持有一个泛型T，然后才可以用泛型T作为方法的返回值
 *      在下面的程序中表现为： <T extends Comparable<T>> ，
 * @param ts
 * @param <T>
 */

/**
 * 关于泛型方法的理解
 *
 * public static <T extends Comparable<? super T>> void sort (List<T> list)的理解
 *
 * public static <T extends Comparable<? super T>> void sort (List<T> list)
 * （1）首先：public static void sort(List list)
 * （2）为了安全性加泛型：public static <T> void sort(List<T> list)
 * （3）想要排序先比较，要有可比较性,因此T（这个时候指的是左边的 T ，不是右边的 T ）必须是Comparable的子类：public static  <T extends Comparable> void sort(List<T> list)
 * （4）Comparable接口也有泛型：public static <T extends Comparable<T>> void sort(List<T> list)
 * （5）T的父类也行，<? super T>表示Comparable<>中的类型下限为T：public static <T extends Comparable<? super T>> void sort (List<T> list)
 */

import java.util.Arrays;

public class CompareNum<T> {
    public static <T extends Comparable<T>> void sort1(T... ts) {
        Arrays.sort(ts);
        T[] temp = ts.clone();
        for (int i = 0; i < ts.length; i++) {
            ts[i] = temp[ts.length - 1 - i];
        }
    }

    /**
     * 设计的排序方法 2
     * @param ts    传递进去的数字数组
     * @param <T>   参数化类型，根据具体的类型的传递，确保只是传递进去了一种数据类型
     *
     *      T... ts 表示同时可以传入多个不确定参数;具体是多少个，根据调用的那边确定
     */
    public static <T extends Comparable<T>> void sort2(T... ts) {
        // 调用了 Arrays 类的 sort() 方法，这个方法可以使用 lambda 表达式简化代码
        // 代码中传递了 一个 lambda 表达式，
        Arrays.sort(ts, (a, b) -> b.compareTo(a));

        // 逆序进行排序
        Arrays.sort(ts,(a,b) -> -1);
    }
}