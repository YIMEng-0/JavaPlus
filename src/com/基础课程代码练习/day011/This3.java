package com.基础课程代码练习.day011;

/*
    最终结论：
        在带有 static 的方法当中，不能直接访问实例方法以及实例变量，需要进行创建对象进行访问
 */

public class This3 {
    public static void main(String[] args) {
        // 使用类直接调用
        This3.doSome();

        //由于处于一个类中所以，这里可以省略掉This3 一般情况下加上最好
        doSome();

        // 这里的东西，因为方法不是静态的，所以需要使用创建对象，通过引用进行访问
        // 实例方法必须先创建对象，通过引用点的方式进行访问
        This3 this3 = new This3();
        this3.doOther();
    }


    public  static void doSome(){
        System.out.println("Do Some");
    }

    public void doOther(){
        System.out.println("Do Other");
    }

    public void run(){
        // 调运run 方法的一定是有对象存在的
        // 创建了一个对象之后，才能调用 run 方法； 所以此处的调用 doOther 的时候没有报错 ， 因为存在对象
        // 也就是说 当前的程序运行的时候，一定是有当前对象的，一定是有 " this " 的

        // 实例变量 实例方法必须有对象的参与
        System.out.println("Run execute");
        doOther();
    }
}

