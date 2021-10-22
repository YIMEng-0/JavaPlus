package com.集合.代码实现;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/26 9:23 下午
 */

// 如何使用迭代器进行其中元素的遍历？
/**
 *  1、获取集合对象的迭代器对象 Iterator
 *  Iterator it = c.iterator();其中 c 是创建的集合对象 Collection
 *
 *  2、通过 hasNext() next() 方法进行集合中元素的遍历，
 *     可以使用 for 循环进行控制，hasNext() 代表控制的条件，next() 进行元素的遍历
 */

/**
 * 重点东西：
 *  1、把集合继承的结构图需要熟记
 *  2、把Collection 接口中的方法进行测试
 *  3、会使用迭代器
 *  4、Collection 接口中的 remove() contains() 是会调用 equals() 方法的，会比较相关的内容
 */
public class 集合遍历迭代专题 {
    public static void main(String[] args) {
        // 下面的迭代方式，在所有的 Collection 及其子类中使用（重点*****）
        // 在 Map 集合中是不能使用的，在所有的Collection 中及其子类中使用

        // 创建迭代器对象
        Collection c = new ArrayList(); // 后面的集合不重要，主要是前面的接口，十分重要。怎么遍历和迭代
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());


        // 对 Collection 进行遍历以及迭代

        // 1、获取集合对象的迭代器对象 Iterator
        // 返回一个包含此集合中所有元素的数组
        Iterator it = c.iterator();
        // 迭代器中的对象，负责遍历 / 迭代集合当中元素的；迭代器最初不是指向第一个元素的;
        // boolean hasNext() = it.hasNext() ；当返回true 的时候，表示还有元素可以迭代，返回 false 表示没有更多的元素可以迭代了
        // Object obj = it.next() 表示让迭代器前进一位，并且将指向的元素返回拿到；
        // 为什么 it 可以对迭代器中的额 iterator 进行调用？
        // 因为 Collection 是继承了 Iterable 的，Iterable 里面实现了 iterator 方法，所以说可以对这个方法进行调用



        // 2、通过上面获取的迭代器对象，开始迭代 / 遍历集合
        /**
         *  下面的方法是 Iterator 中的方法；
         *      boolean hasNext() 如果任然有元素可以迭代，返回 true
         *      Object next() 返回迭代的下一个元素
         */

        // hasNext() 表示的是下一个元素还存在，返回 true
        // hasNext() 与 next() 方法联合使用，上面的判断，下一个元素是否是存在的，下面的可以将数据值返回，进行相关的打印操作
        while (it.hasNext()) {
            // 无论当初存储的是什么元素，最后出来的都是 Obj 对象
            Object obj = it.next();
            System.out.println(obj);
        }

        /**
         * 第一步、取到迭代器
         * 第二部、对迭代器进行循环，取到里面的元素
         */
    }
}

// itrator 调用方法可以返回对象，继承了 Iterator