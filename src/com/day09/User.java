package com.day09;

/**
 * 封装的步骤
 * 1、所有的属性进行私有化 private ，修饰所有的数据
 * 2、对外体提供简单的操作入口，也就是说外部的额程序想要访问 age 属性，必须进行简单的入口的访问
 * - 对外提供两各公开的方法，分别是 get 方法以及 set 方法，进行访问
 * - 想读取调用get
 * - 想修改调用set
 * <p>
 * 3、set 方法的命名规范：
 * public void setAge(int a){
 * age = a;
 * }
 * 4、get 方法的使用规范
 * public void getAge(){
 * return age;
 * }
 * <p>
 * 5、关于调用 static
 * 有   static 类名.方法名（实际参数）
 * 没有  static 引用.方法名（实际参数）
 * <p>
 * 回想：属性的访问有几种形式
 * 1、读取属性的值 get
 * 2、修改属性的值 set
 */
public class User {
    private int age;

    // setter 不需要返回只需要修改
    public void setAge(int a) {
        // 进行逻辑代码的编写
        if (a > 150 || a < 0) {
            System.out.println("Input Age Error!");
            return;
            //age = a; // java 中有就近原则，这里其实没有给 age 属性赋值，这里的 age 是局部变量 age
        }
        else {
            age = a;
        }
    }

    // getter
    public int getAge() {
        return age;
    }
}