package com.day07;

/*
    内存分析
    所有的类进行创建对象都是引用变量 类的实例化
    引用保存的内存地址指向对象

    引用可以是一个成员或者局部变量

    编译器将会将与之相关的类都进行编译
    方法区内存
        - String.class
        - User.class
        - Address.class
        - 测试类.class

    栈内存
         - main()
         - u 存储对象的地址

    堆内存
         - 存储创建出来的对象 默认值 0 null null
 */

public class 测试类 {
    public static void main(String[] args){
        User u = new User();
        u.name = "Jack";

        // u.addr 没有赋值 里面是三个 null
        u.addr = new Address();
        System.out.println(u.addr);
        System.out.println(u.name);

        //所有的一些的引用只能通过 u 进行访问
        u.addr.city = "Bei jing";
        System.out.println(u.name + "住在" + u.addr.city);
    }
}


