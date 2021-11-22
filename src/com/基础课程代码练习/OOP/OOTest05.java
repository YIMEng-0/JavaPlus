package com.基础课程代码练习.OOP;

// 测试程序

public class OOTest05 {
    public static void main(String[] args){

        Customer c = new Customer();
        c = null;

        // 此时出现了空引用访问  "实例" 相关的数据,出现空指针异常（没有对象的野指针）(NPE)
        // java.lang.NullPointerException

        // 调用了 null.id 空的地址怎么会存在id 呢，这个时候显然是会报错的
        System.out.println(c.id);
    }
}
