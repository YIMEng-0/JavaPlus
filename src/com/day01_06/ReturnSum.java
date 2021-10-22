package com.day01_06;

public class ReturnSum {
    public static void main(String[] args){
        int res = getSum(9,9);
        System.out.println(res);

        Class c1 = ReturnSum.class;
        System.out.println(c1.getClass());
        System.out.println(c1.getClasses());
    }

    public static int getSum(int a,int b){
        int result = a + b;

        // 返回的东西需要与定制的东西是一致的 上面是 int 下面必须是 int  并且是非空的
        // return 后面的语句是不会执行的 强行退出
        return result;
    }
}