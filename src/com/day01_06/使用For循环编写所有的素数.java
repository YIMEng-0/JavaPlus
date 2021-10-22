package com.day01_06;

// 素数 可以被自己以及其他的数字整除的数字
// 一万个里面换一个行

public class 使用For循环编写所有的素数 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean flag;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;

                }
            }
            if (flag) {
                count++;
                System.out.print(i + "     ");
                if(count % 8 == 0){
                    System.out.println();
                }
            }
            // 加入统计机制每相隔 8 个进行放在一行中
        }
    }
}