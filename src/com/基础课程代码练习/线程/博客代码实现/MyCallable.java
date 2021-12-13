package com.基础课程代码练习.线程.博客代码实现;

import java.util.concurrent.Callable;

/**
 * @author Doraemon
 * @date 2021/12/11 12:02 下午
 * @version 1.0
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " call 方法执行");
        return 1;
    }
}
