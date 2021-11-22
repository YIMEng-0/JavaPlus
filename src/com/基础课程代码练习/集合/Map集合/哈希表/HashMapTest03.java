package com.基础课程代码练习.集合.Map集合.哈希表;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 2:38 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap 集合key 部分允许 null 吗？
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();

        // HashMap 中允许 key 的值为 null
        map.put(null,null);
        System.out.println(map.size()); // 1

        // key 重复的话，value 是会被覆盖掉的；
        map.put(null,100);
        System.out.println(map.size());

        // 测试通过 null 能否获取到 value
        System.out.println(map.get(null)); // 可以获取 00
        // 在 HashMap 中是允许为空的，但是只能出现一次，因为出现第二次的时候，就会被覆盖掉的；
        // 使用了 key 经过哈希函数变成了数组中存储的下标；
    }
}
