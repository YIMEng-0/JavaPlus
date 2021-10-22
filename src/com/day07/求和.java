package com.day07;

public class 求和 {
    public static void main(String[] args){

        System.out.println(sum(3));


    }

    // 使用递归进行求和
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);

    }
}