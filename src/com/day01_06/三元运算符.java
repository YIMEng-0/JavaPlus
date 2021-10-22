package com.day01_06;

public class 三元运算符 {
    public static void main(String[] args){
        boolean sex = false;
        char c =  sex ?'男':'女';
        // sex? 为需要判断的表达式 当表达式为真运行语句一 当表达式为假 运行语句二 即为后面的表达式
        System.out.println(c);
    }
}