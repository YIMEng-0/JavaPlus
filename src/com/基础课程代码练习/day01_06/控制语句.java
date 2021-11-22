package com.基础课程代码练习.day01_06;
// package  后面加上一个包的名字 进行类的管理 一个名字空间的作用

// 选择
// 控制
// 循环
// 使用判断条件进行判断一下
// System.out.println() 从内存中向着控制台进行输出
// 年龄需要进行控制台的输入
// 接收键盘的输入 控制是数字
// print println 函数的区别就是换行以及不换行
public class 控制语句 {
    public static void main(String[] args) {
        // 创建键盘扫描器对象
        System.out.print("输入：");
        // 开发出来的工具包 里面各种方法的使用
        java.util.Scanner s = new java.util.Scanner(System.in);

        // 调用一个next()函数 接收键盘的输入以及输出
        // 用户输入的时候，点击回车键 进行自动的赋值
        int age = s.nextInt();
        System.out.println("你输入的是：" + age);
        String str = "老年人";
        if(age < 0 || age > 150){
            str = "非法输入";
        }
        else if(age <= 5){
            str = "小孩子";
        }
        System.out.println("您现在所处的年龄阶段是："+str);
        // 使用键盘输入 控制台进行相关的输出
    }
    /*
    * 函数的简单调用
    */
}
