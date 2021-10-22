package com.集合.代码实现;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/28 10:33 下午
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合元素中的 remove()
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        // 创建元素
        Collection c = new ArrayList();

        // 添加元素
        c.add(1); // 放进去的是 Integer 对象的内存地址
        c.add(2);
        c.add(3);

        // 获取迭代器
        Iterator it = c.iterator();

        while (it.hasNext()) {
            // next() 的放回值类型必须是 Object
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
