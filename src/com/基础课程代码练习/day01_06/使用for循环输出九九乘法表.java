package com.基础课程代码练习.day01_06;

public class 使用for循环输出九九乘法表 {
    public static void main(String[] args){
        for (int i = 1;i <= 9;i++){
            //System.out.println(i); //外层进行循环九次 i 是行号
            for(int j = 1;j <= i;j++){
                System.out.print( i + " * " + j + " = "+i * j + "     ");
            }
            // 进行换行处理
            System.out.println();
        }
    }
}