package com.集合.Map集合.哈希表;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 4:28 下午
 */
public class MapTest03 {
    public static void main(String[] args) {
        // 创建 Map com.集合
        Map<Integer, String> map = new Hashtable<>();

        // 添加元素
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map.size());
        System.out.println(map.get(2));
        // Map 遍历的几种方式
        // 第一种：先获取到所有的 key ，通过 key 获取到 value
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // 第二种方式，将Map 集合转换成为 Set com.集合，Set 集合中的每一个元素是一个节点Node
        // Node 节点中有 键值对，也就是 key - value
        System.out.println("\n===将Map 转换成为 Set 储存的节点保存的数据进行遍历===");
        Set<Map.Entry<Integer, String>> nodes = map.entrySet();
        for (Map.Entry<Integer, String> node : nodes) {
            System.out.println(node.getKey() + " = " + node.getValue());
        }
    }
}
