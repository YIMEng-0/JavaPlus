package com.基础课程代码练习.day016.多态;

public class 多态的总结 {
    public static void main(String[] args) {
        // Cat is a Animal
        // 编译 animal 是Animal 类型的
        // 底层的对象的创建 animal 代表的是 Cat 的对象，会运行 Cat里面的方法

        // 父类型的引用指向子类对象 向上转型
        Animal animal1 = new Cat();
        Animal animal2 = new Bird();

        // 进行数据类型的转换 能转的时候再转换，不能随便转换
        // instance 进行简单的判断
        if (animal1 instanceof Cat){
            // 向下转型 从右边向着左边进行转换，看是向上转换还是向下转换，进行相关的判断操作
            Cat cat1 = (Cat) animal1;
        }
        else if(animal2 instanceof Bird){
            Bird bird1 = (Bird) animal2;
        }
    }
}
