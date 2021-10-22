package com.泛型;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 3:58 下午
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDK 8 之后：引入了自动类型推断机制（成为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        // ArrayList<在这里的数据类型会自动判断>() 前提是在JDK 8 之后，才拥有的特新
        // 自动类型推断，在右边的数据类型是可以省略掉的
        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        // 进行集合的遍历
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            animal.move();
        }

        List<String> myStr = new ArrayList<>();
        // 添加的元素需要是类型匹配的
        // 否则编译器是会报错的
        myStr.add("www");
        myStr.add(".baidu");
        myStr.add(".com");

        // 在迭代器的位置，也需要使用泛型，创建了迭代器，对于元素进行遍历，调用相关的方法
        Iterator<String> it1 = myStr.iterator();
        while (it1.hasNext()) {
            String string = it1.next();
            System.out.println(string);
        }

    }
}
