package com.基础课程代码练习.day07;
// 1. 方法中的内存
// 2. 方法的重载
// 3. 递归
// javac 进行编译
// java  进行运行
public class 方法内存分析 {
    int num = 1919; // 这是一个全局变量 方法里面的都只是局部变量
    // 栈内存当中，主要存储的是局部变量

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // 此处的调用可以不加上点 因为在一个类中
        int resValue = sumInt(a,b);
        System.out.println("resValue : " + resValue);
    }

    public static int sumInt(int a,int b){
        int result = a + b;
        int num = 3;
        int resValue = divide(result,num);
        return resValue;
    }

    private static int divide(int x, int y) {
        int z = x / y;
        return z;

    }

}

/*
    1   将代码进行编译 （结果成为.class 文件 ）
    2   使用类加载起将类放在 JVM 中，放到方法区中


    画图的依据
        1   涉及到参数的传递问题，传递的是变量中保存的值 传递的是变量大各种保存的值 传递的是变量当中保存的值
        2   遵循方法遵循方法从上倒下执行的顺序即可
*/
