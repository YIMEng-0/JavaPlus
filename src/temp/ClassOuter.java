package temp;

import javax.sound.midi.Soundbank;

public class ClassOuter {
    // 创建非静态变量
    private int noStaticInt = 1;
    // 创建静态变量
    private static int STATIC_INT = 2;

    public void fun() {
        System.out.println("外部类方法");
    }

    public class InnerClass {
        // static int num = 1; 此时编辑器会报错 非静态内部类则不能有静态成员

        int a = noStaticInt;
        int b = STATIC_INT;

        public void fun() {
            // 非静态内部类的非静态成员可以访问外部类的非静态变量。
            System.out.println(STATIC_INT);
            System.out.println(noStaticInt);
            System.out.println(STATIC_INT);

        }
    }

    public static class StaticInnerClass {
        static int NUM = 1;//静态内部类可以有静态成员
        int a = 10; // 静态内部类还可以存在非静态成员

        public void fun() {
            System.out.println(STATIC_INT);
            //System.out.println(noStaticInt); 此时编辑器会报 不可访问外部类的非静态变量错
        }
    }
}



class TestInnerClass {
    public static void main(String[] args) {
        //非静态内部类 创建方式1
        ClassOuter.InnerClass innerClass = new ClassOuter().new InnerClass();
        //非静态内部类 创建方式2
        ClassOuter outer = new ClassOuter();
        ClassOuter.InnerClass inner = outer.new InnerClass();
        //静态内部类的创建方式
        ClassOuter.StaticInnerClass staticInnerClass = new ClassOuter.StaticInnerClass();
    }
}