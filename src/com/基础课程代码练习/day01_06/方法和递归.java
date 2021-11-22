package com.基础课程代码练习.day01_06;

// 方法的调用以及相关的使用

public class 方法和递归 {
    public static void main(String[] args){
        // 使用了静态的方法 所以需要使用类的名字方法进行调用
        方法和递归.sumInt(2,5);

    }

    // 方法使得到吗得到了重复的使用 可用性加强 完成一定的功能并且可以进行重复的使用 这就是方法
    // Method 可以叫做函数 Function Java 中所有的命名使用驼峰的方法即可
    // 类中可以存在多个方法 没有先后顺序
    // 方法体当中不能进行定义方法 放在类题中即可
    // 方法体中不能继续定义方法 只能是 Java 语句
    public static void sumInt(int a,int b){
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
