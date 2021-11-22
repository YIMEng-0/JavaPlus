package com.基础课程代码练习.集合.Map集合.哈希表;

import java.util.Objects;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 1:29 下午
 */
public class Product {
    private int no;
    private String name;



    public Product(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 需求：当商品的名字相同的时候，认定两个商品就是同一个东西
    // 根据不同的需要，选择不同的东西即可
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return no == product.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
