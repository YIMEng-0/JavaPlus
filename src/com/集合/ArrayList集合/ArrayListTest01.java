package com.集合.ArrayList集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/29 8:40 下午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList集合
 * 1、默认的初始化容量是 10（底层先创建了一个为空的数组，当添加第一个元素的时候，初始化的容量为 10，进行了底层的优化）；
 * 2、集合底层是一个 Object[] 数组
 * 3、构造方法可以采用默认的额容量大小
 * 4、构造方法可以给定初始值，确定容器的大小
 *
 * 5、ArrayList 集合的底层在扩容方面，使用的是原始的大小的 1.5 倍，建议给定数组的初始值，重要的优化策略
 *      ArrayList 底层是数组，所以尽量比较少的进行扩容，会影响性能，最好一开始，给定数组中的大小；
 *
 * 6、数组的优点和缺点：
 *      数组在随机的进行元素添加的时候，效率比较低下，但是在数组的末尾添加元素的时候，效率非常的高
 *      优点：每个元素占用空间大小是相同的，内存地址是连续的，知道首元素的地址
 *           知道下标，数学表达式计算出来元素的内存地址，所以检索的效率是比较好的
 *
 * 7、面试常用？
 *      上面的集合中，什么用的比较多？
 *          ArrayList
 *          因为在数组的末尾添加元素时候，效率不受影响，一般加入元素在最后面加入；
 *          在查找元素的时候，数组的查找速度是比较好的；
 *
 */

public class ArrayListTest01 {
    public static void main(String[] args) {
        // 默认的初始化值
        List list1 = new ArrayList();

        // size() 用来获取到集合中的元素的个数，不是集合的容量

        // 给定的初始化值
        //
        List list2 = new ArrayList(20);

        System.out.println(100 >> 2);
        System.out.println(100 >> 1);
        System.out.println(100 >> 3);
        System.out.println(100 >> 4);

    }
}
