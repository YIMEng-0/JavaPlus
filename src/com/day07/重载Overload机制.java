package com.day07;

/*
    1   什么是方法的重载？
    使用不同传进去的东西 找到不同的函数进行结果的执行
    是的调用方法更加的方便
    当函数的功能实现比较近似的时候，可以使用重载，对于方法的名字的记忆更加的友好
    运行的机制必须相似 否则会造成运行的混乱
    2   什么时候考虑使用方法的重载
    功能相似的时候，考虑使得方法的名字相同
    3   方法重载与什么有关？
    与定义的参数的个数以及其数据类型有关
    方法的重载和方法名字以及参数的列表有关
    4   overload 的应用 重载
    方法的重载 虽然名字是相同的 根据调用的数值的数据类型 函数会进行自动的寻找到需要调用的函数



 */

public class 重载Overload机制 {
    public static void main(String[] args) {
        // 下面进行简单的测试
        System.out.println(" 这是 double 运行的结果： " + sumInt(4.9, 9.8));
        System.out.println(" 这是 int 运行的结果： " + sumInt(6, 6));
        System.out.println(" 这是 long 运行的结果： " + sumInt(89798789, 676767677));
    }

    public static int sumInt(int a, int b) {
        int c = a + b;
        return c;
    }

    public static double sumInt(double a, double b) {
        double c = a + b;
        return c;
    }

    public static long sumInt(long a, long b) {
        long c = a + b;
        return c;
    }
}
