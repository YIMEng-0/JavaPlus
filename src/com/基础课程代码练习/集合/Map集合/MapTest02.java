package com.基础课程代码练习.集合.Map集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/1 3:41 下午
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 集合的遍历
 *      非常的重要，一定需要掌握；
 */
public class MapTest02 {
    public static void main(String[] args) {
        // 1、获取到所有的 key 通过 key 遍历 value ;
        // 钻石表达式，自动类型推断，判断出来在 Map 中存放的到底是什么东西
        // 有尖括号的出现，意味着在这里使用了泛型，限定了元素的使用空间，只能使用规定好的元素；
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Tom");
        map.put(3,"Henny");

        // 获取所有的 key ，所有的 key 是一个 Set com.基础课程代码练习.集合
        Set<Integer> keys = map.keySet();
        // 遍历key ，通过 key 获取到 value
        // 迭代器对象，foreach 都可以

        // 创建了迭代器，迭代器里面的元素需要限定存储数据类型，在这里使用了 Integer ，
        Iterator<Integer> iterator = keys.iterator();
        System.out.println("使用普通的迭代器进行的打印：");
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            // 先获取到键，然后通过键获取到相关的值，
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        // foreach 对象也是可以的
        for(Integer key : keys) {
            // 两种迭代的方式，都会对元素进行一个遍历，都使用到了 get() 方法，得到 key
            System.out.println("使用增强的循环进行元素的打印: " + map.get(key));
        }

        // 第二种方法Set<Map.Entry><K,V> entrySet()
        // 上面的方法是将 Map 集合直接全部转换成为 Set com.基础课程代码练习.集合
        // Set 集合中元素的类型是：Map.Entry
    }
}
