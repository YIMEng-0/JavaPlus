package com.基础课程代码练习.day01_06;

/*
    // 进行匹配 匹配好了进行执行

    switch(使用 int 或者 String){
        case int / String

        default:
        java 语句
    }
 */

public class Switch {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入数字：");
        int num = s.nextInt();
        switch (num){
            case 1:
                System.out.println("今天是星期一");

                // 需要进行 break 进行中断操作
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三 ");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期七");
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}
