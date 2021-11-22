package com.基础课程代码练习.泛型;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/30 3:15 下午
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 统一了传入集合中的数据类型
 *      设定了只能放进去 Animal 类型，在后面就不需要使用强制的类型转换了
 */

/**
 * JDK 5.0 之后推出来的泛型
 *      泛型只是在编译阶段有作用，在运行阶段是没有作用，只是给编译器参考的；
 *      在泛型中存储了不是自己定义的数据类型，编译器是会报错的；属于编译期间的特性
 * 使用了泛型的好处？
 *      1、集合中存储的元素统一了
 *      2、从集合中取出来的元素也会统一，集合中取出来的元素是泛型指定的类型，不需要进行强制的类型转换；
 * 泛型的缺点是什么？
 *      1、导致集合中存储的元素缺乏多样性
 *      2、类型是比较单一的，不允许存储其他的数据类型
 * 实际的开发中，大部分存储的数据类型是统一的，方便管理，使用的地方比较多；泛型是被大家所接受的；
 */
public class GenericTest01 {
    public static void main(String[] args) {
        // 使用泛型 进行数据的操作
        // 使用泛型 List<Animal> 之后，表示 List 集合中，只是允许存储 Animal 类型的数据
        // 使用泛型指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<>();

        // 指定了在集合中存储 Animal 的数据类型，存储其他的数据类型，编译器就会报错
        // 用了泛型之后，集合中数据类型的元素更加的统一了

        Animal cat = new Cat();
        Animal bird = new Bird();
        myList.add(cat);
        myList.add(bird);

        // 获取迭代器
        // 表示迭代器迭代的是 Animal 类型
        Iterator<Animal> it = myList.iterator();

        while (it.hasNext()) {
            // 使用了迭代之后，每一次进行的迭代对象都是 Animal 的数据类型
            Animal animal = it.next();
            // 此处不需要使用强制类型转换就可以实现方法的调用
            animal.move();

            // 调用父类型的方法不需要进行强制类型转换，子类型的额方法是需要强制类型转换的
            // 因为在集合中存储的是 Animal 的数据类型，已经被限制住了，所以在使用子类的方法的时候，是需要进行强制的类型转换的；
            if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.catchMouse();
            }else if (animal instanceof Bird) {
                // 进行强制的类型转换，使用子类中的方法
                Bird bird1 = (Bird) animal;
                bird1.fly();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("正在捉老鼠");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("正在飞翔");
    }
}