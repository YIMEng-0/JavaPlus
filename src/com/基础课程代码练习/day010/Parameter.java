package com.基础课程代码练习.day010;

/**
    参数的传递 Java 中只传递相关的值，有时候这个值是另外一个对象的地址
 */
public class Parameter {
    public static void main(String[] args) {
        // 构造函数 新建了一个对象 对象里面的age 进行赋值变为 20
        // 调用了一个构造方法
        // u 是一个引用变量 接收对象的地址
        // java 进行参数的传递的时候 所传的东西都是变量保存的值
        // 对象的构造 使用了构造函数 创建对象
        User u= new User(20);

        // u 是一个局部变量 自己本身是具有内存地址的 u 里面保存了 指向对象的内存地址
        // java 在参数的传递中，永远传递的都是变量保存的值，只有值是传递的 ，保存的额地址，就把地址传过去 有时候是值，有时候是对象的地址
        add(u);
        // 传递的是变量当中保存的值 add 和 main 中的两个 u 是不同的都有自己的内存，将 u 保存的地址传递过去

        System.out.println("main-->" + u.age);
        // 指向的对象是同一个 所以得到的数值都是 21 因为前面已经进行了加一指向的对象是同一个
        // 方法的调用，永远传递的都是值
    }

    public static void add(User u){
        u.age++;
        System.out.println("add-->" + u.age);
    }
}

class User{
    int age;

    // 构造方法 没参数的构造方法没了
    public User(int i){
        age = i;
    }
}

class Student{
    private int id;
}

class Book{

}
