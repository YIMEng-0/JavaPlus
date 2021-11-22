package com.基础课程代码练习.day017;

import com.基础课程代码练习.day011.Date;

/**
 * Java 中import 的使用 package
 *      1、关于Java语言中的包机制：
 *          1、package 引用其是为了方便程序员管理程序，不同功能的类进行分类，可以是的管理，查找比较方便，容易维护
 *          2、怎么定义package Java 程序中的第一句中写上 package
 *              - package 只能写一个语句
 *              - package 包名
 *          3、包命名的规范：
 *              公司的域名 + 项目名字 + 模块名 + 功能名字
 *              采用这种方式的重名的几率是比较低的，公司域名具有全球唯一性
 *
 *          4、目录之间使用点进行隔开，一个包对应一个目录
 *
 *      2、什么时候需要使用 import ？
 *          * 1、不是java.lang 包下面，并且不是一个包中的东西，需要使用 import 进行导入
 */
public class Import {
    public static void main(String[] args) {
        // 其他包中的东西 这里需要进行导入使用
        Date date = new Date();
        System.out.println(date);
    }
}
