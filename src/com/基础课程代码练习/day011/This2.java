package com.基础课程代码练习.day011;

public class This2 {
    // 成员变量包含实例变量 和 静态变量 实例变量需要使用对象进行调用
     int i = 10;
    public static void main(String[] args) {
        // i 是定义在类体中的实例变量 ， 需要使用对象进行访问 不是静态的,实例的东西都需要对象才能进行访问，静态的东西使用类就可以进行访问
        // System.out.println(i); 这里的访问会报错 ， 有了 static 的方法是不能直接访问实例变量的

        // 想要访问 i 创建对象
        This2 this2 = new This2();
        System.out.println(this2.i);
    }
}
