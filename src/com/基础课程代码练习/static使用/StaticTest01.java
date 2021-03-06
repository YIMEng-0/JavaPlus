package com.基础课程代码练习.static使用;
/**
    使用static 关键字定义"静态代码块"
        1、static{
            java语句
        }

        2、静态代码在类加载时执行,并且只执行一次

        3、在一个类中，可以进行多个编写，并且可以从上到下的顺序一次执行
        4、为什么需要静态的语句快 实际开发中的使用，它的作用是什么？
            - 进行日志的记录，软件打开的一瞬间进行执行相关的代码，可以制作成为开机广告
            - 类加载的时机，类加载的时候，进行吃饭操作
            - 与实际的项目的需求有关，项目中的在类加载的时候，执行相关的代码，完成日志的书写操作
            - 记录的日志文件可以书写到静态的代码之中
            - Java 准备的特殊的时刻，叫做类加载时刻，执行特殊的程序，直接放在静态代码中
            - 就执行一次，因为类只加载一次

        5、 通常会在静态代码中完成预备操作，完成数据的预处理操作，初始化界面，初始化操作
 */
public class StaticTest01 {
    static {
        // 在类进行加载的时候进行加载
        System.out.println("类进行加载 1 次");
    }

    static {
        System.out.println("项目正在加载中...");
    }

    static {
        System.out.println("类进行加载 2 次");
    }

    static {
        System.out.println("类进行加载 3 次");
    }


    public static void main(String[] args) {
    }
}
