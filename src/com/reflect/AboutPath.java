package com.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/18 7:27 下午
 */

import java.io.FileNotFoundException;

/**
 * 研究文件的路径问题：
 *
 */
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        // 使用了下面的代码在执行的时候，可以执行是比较差的
//        FileReader reader = new FileReader(" ");

        // 下面是比较通用的东西，当代码移动的时候，编写还是通用的；
        // 使用下面的通用方法：文件放在了类的路径下面；
        // 什么是类路径？
        // 凡是在 src 路径下面的东西都是类路径；src 是类的根路径

        /**
         *  Thread.currentThread() 是当前线程对象；
         *  getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
         *  getResource() 是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源；
         *
         */
        String path = Thread.currentThread().getContextClassLoader().getResource("com/day01_06/").getPath();
        System.out.println(path);

        // 使用了上面的方式可以获取到文件的绝对路径
        // 只要文件放在了 src 的下面就永远可以找到的，可以随便的进行移植操作，是没有影响的；
        // 前提就是一定在类的路径下面，其他的地方就不行了
    }
}