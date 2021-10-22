package com.集合.Map集合.哈希表;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 2:46 下午
 */

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable 的key 可以是null 吗？
 *      所以 HashTable key value 都是不能为空的，否则会出现空指针异常的错误
 *          HashMap 里面的键值对都是可以为空的，不会报错
 *
 * HashTable 是线程安全的，线程安全有其他的方案，HashTable 效率比较低下，现在使用的比较少了；
 *
 * HashTable 默认的容量是 11 ，0.75 的因子
 *      扩容是原来的容量乘以 2 再 +1；
 */
public class HahsTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
//        map.put(null,1);
//        System.out.println(map.size()); // 报错了，因为不允许存放空值 会出现空指针异常
        map.put(1,null);
        System.out.println(map.size());   // 空指针异常了

    }
}
