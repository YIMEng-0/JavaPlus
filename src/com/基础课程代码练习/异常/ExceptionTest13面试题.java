package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 6:32 下午
 */
public class ExceptionTest13面试题 {
    /**
     *  java  中的语法规则，有一些是不能破坏的
     * @param args
     */
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);  // 100
    }

    // 不能违背自己的从上到下的语法规则
    // return 一定是在最后面执行的
    public static int m() {
        int i = 100;      // 100 反编译之后，发现在底层重新对于 i 进行了赋值操作
        try {
            return i;
        }finally {
            i++;
        }
    }
}
