package com.集合.ArrayList集合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 4:54 下午
 */
public class Box<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值为：%d\n\n",integerBox.get());
        System.out.printf("字符串：%s\n\n",stringBox.get());


        // 类型统配符号：？
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        age.add(99);
        name.add("Tom");

        getData(name);
        getData(age);
        getData(numbers);
    }

    // 通配符号 表示的是所有可能在 <> 中表示的相关类型
    public static void getData(List<?> data){
        System.out.println("data:" + data.get(0));
    }
}
