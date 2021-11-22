package com.基础课程代码练习.OOP;

public class OOTest04 {
    public static void main(String[] args){
        // 创建一个妻子和丈夫对象
        // 结婚 通过丈夫找到妻子 通过妻子找到丈夫

        Husband huang = new Husband();
        huang.name = "黄晓明";

        Wife baby = new Wife();
        baby.name = "Angle baby";
        huang.w = baby;
        baby.h = huang;

        // 得到丈夫的妻子的名字
        System.out.println(" 妻子的名字是： " + huang.w.name);
    }
}