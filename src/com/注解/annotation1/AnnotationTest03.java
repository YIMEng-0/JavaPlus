package com.注解.annotation1;


public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03.doSome();
    }

    @Deprecated // 过时的方法，
    public static void doSome() {
        System.out.println("do some");
    }

    @Deprecated // 告诉其他的程序员，这个方法过时了，还有更加好的方法，进行使用
    public static void doOther() {
        System.out.println("do other");
    }
}
