package com.day01_06;

public class 判断使用雨伞的种类 {

    public static void main(String[] args){
        // 开局可以使用很多个 println 函数进行功能的简单介绍
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Please Input Weather:");

        int weather = s.nextInt();
        if (weather == 1){
            System.out.println("现在所处的天气是晴天");
        }
    }
}
