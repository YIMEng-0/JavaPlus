package com.集合.Map集合;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 6:07 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 中的常用方法
 *  1、Map 和 Collection 没有继承关系
 *  2、Map 集合使用键值对的方式存储数据：键值对
 *      key 和 value 都是引用数据类型，两者保存的都是存储对象的地址
 *      key 起到的是主导的作用，value 是一个附属品；
 *
 *  3、Map 中的常用方法：
 *      V put(K key,V value)                 向着 Map 集合中添加键值对
 *      void clear()                         清空Map
 *      boolean containsKey(Object key)      判断Map 中时候包含某个 key
 *      boolean containsValue(Object value)  判断 Map 中是否包含某个 Value
 *      ...
 *      支持泛型<K,V>
 *      V get(Object key)                    使用 get() 返回 value
 *      boolean isEmpty()
 *      Set<K> keySet()                      获取Map 集合所有的 key;所有的 key 是Set com.集合
 *
 *      int size()
 *      Collection<V> values()               获取集合Map 中所有的value ，返回一个 Collection
 *      Set<Map.Entry><K,V>entrySet<>        将 Map 集合转换成为 Set com.集合
 *              将 Map 集合转换为 Set com.集合
 *              假设有一个 Map com.集合，如下所示：
 *                  map1 com.集合
 *                  key         value
 *                  -----------------
 *                  1           zhangsan
 *                  2           Jack
 *
 *                  Set set = map1.entrySet(); // 将整个 Map 转换成为了 Set com.集合
 *                  set 集合对象
 *                  1 = zhangsan               // 看成了一个元素放到了集合当中
 *                  2 = lisi                   // 这个里面的数据类型是：Map.Entry<K,V>
 *                                             // Map.Entry 和 String 都是一种类型的名字，Map.Entry 是静态内部类，是Map 中的静态内部类
 *
 *
 *
 *      ...
 */
public class MapTest01 {
    public static void main(String[] args) {
        // 创建 Map 对象
        // 在这里添加的元素，使用的是泛型机制，将可以添加的元素进行了一定的限制，防止一些杂乱的元素放到我们的容器当中
        // 泛型，先定了两个东西，一个是 key 一个是 value ，后面的泛型没有写，是自动识别的
        // Map 是 HashMap 的父类，这个叫做父类型的引用指向了子类行的对象，叫做想上面转型，编译的时候是父类，运行的时候是子类
        Map<Integer,String> map = new HashMap<>();
        Map map1 = new HashMap();
        map1.put(1,"12");
        map1.put(2,12);
        // Incompatible types. Found: 'java.util.Collection', required: 'java.lang.String'
        // 在下面中没有使用泛型，容器中会包括了不同的数据类型，此时想要使用一个容器把集合中的所有 values 包含进去是不合适的；
        // 报错信息会显示：不相容的，矛盾的，不能同时成立的
//        String str =  map1.values();

        // 向着Map 集合中添加键值对
        map.put(1,"Jack");
        map.put(2, "Tom");
        map.put(3,"Anny");

        // 通过 key 获取到 value
        System.out.println("获取到相关的 value: " + map.get(1));

        // 获取键值对的数量
        System.out.println("获取到键值对的个数：" + map.size());

        // 通过key 删除 key - value
        map.remove(2);
        System.out.println("键值对的数量： " + map.size());

        // 判断是否包含某个 key
        // contains() 方法在底层调用的都是 equals() 方法进行比对的，所以自己定义的类，需要自己定义 equals() 方法；
        System.out.println("在集合中根据 key 判断是否包含：" + map.containsKey(6));

        // 判断是否包含某个 value
        System.out.println("在集合中根据 value 判断是否包含：" + map.containsValue("Jack"));

        // 判断是否是空的
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        // 将目前放进去的 value 值使用数组进行打印出来
        System.out.println(map.values());
    }
}