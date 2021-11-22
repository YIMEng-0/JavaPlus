package com.基础课程代码练习.线程.实现线程的第三种方式;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/15 11:27 上午
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask; // java 并发包，老得JDK 没有这个包，是一个新的特性；

/**
 * Callable 可以获取到线程的返回值，前面讲到的两种方式是没有办法获取到线程的返回值的；
 * 因为 run 返回 void;
 * <p>
 * 思考：
 * 系统委派一个线程执行一个任务，线程执行完毕之后，可能需要返回一个结果，拿到结果，需要使用第三种方式
 */

/**
 * 执行的优点：
 *  可以得到线程的返回结果；
 * 执行的缺点：
 *  使得程序的执行效率变得低下了；
 */
public class MyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1、创建一个未来对象任务
        // 参数是非常重要的，需要给一个 Callable 接口实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { // call 方法相当于一个 run()方法。只是这个是具有返回值的；
                // 线程执行了之后，可能是会存在一个执行结果的；
                System.out.println("call method begin");
                Thread.sleep(6000);

                System.out.println("call method end");

                int a = 100, b = 200;
                return a + b; // 使用了自动装箱的机制 Integer
            }
        });

        // 创建线程对象
        Thread t = new Thread(task);

        //启动线程
        t.start();

        // 在主线程（main）中获取到 t 线程得到的运行结果？
        /**
         * get 方法会导致线程阻塞吗？
         *      会的，因为程序从上面到下面的执行顺序，执行顺序是不能改变的；
         *      get 的执行时间可能是比较长的，而另外一个线程的执行时间是比较长的；
         */
        Object obj = task.get();

        System.out.println(obj);

        System.out.println("hello world");
    }
}