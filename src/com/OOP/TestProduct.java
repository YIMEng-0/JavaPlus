package com.OOP;

/*
    每一个类都可以写主方法，一般情况下，一个系统只有一个入口，所以写一个
 */

public class TestProduct {
    public static void main(String[] args) {
        // 创建商品对象
        // 局部引用变量
        Product iphone = new Product();

        // 引用.变量名字
        iphone.productNo = 123456;
        iphone.price = 1.11;

        // 对象的访问
        // 对象的修改

        System.out.println("商品的单价： " + iphone.price);
        System.out.println("商品的编号： " + iphone.productNo);

    }
}
