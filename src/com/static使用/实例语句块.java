package com.static使用;

/**
    实例语句块 / 代码块
    「使用的比较少，了解即可」

    1、实例代码块，可以书写多个，按照从上到下的顺序执行，
    2、实例代码块在构造器之前执行，构造方法依次执行
    3、Java中特殊的时机，叫做对象初始化时机
 */

/**
 *  大多数的额方法都定义成为实例方法，一般一个行为或者一个动作发生的时候，需要对象的参与；
 *  但是也有例外，当大多数的工具类的时候，此时需要定义的是静态的方法类
 *  大多数的工具类中的方法是静态方法，因为工具类就是方便编程，
 *  为了方便的调用，此时不需要创建对象
 */

/**
 * 在static 里面就是类变量，形成的变量是类级别的，不是某一个对象的，
 * 所形成的方法是类级别的，不是属于某一个方法的，是属于一类对象的；
 */

public class 实例语句块 {

    // 书写实例代码块
    {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    {
        System.out.println(3);
    }


    // 构造函数
    public 实例语句块() {
        System.out.println("Test类的缺省构造器执行");
    }

    // public 表示公开的，在任何位置都是可以访问的
    // static 表示静态的，表示可以使用类名点的方式，不需要进行对象的创建，可以调用main 方法
    // void 表示运行结束。不返回任何值
    // （[表示]main 方法的形式参数表）
    public static void main(String[] args) {
        System.out.println("Main Begin!");

        // 创建一个对象
        new 实例语句块();

        // 可以使用类名进行调用，在同一个类中可以不实用
        main(6);
    }

    // 进行方法的啊
    public static void main(int i) {
        System.out.println(i);


    }
}
