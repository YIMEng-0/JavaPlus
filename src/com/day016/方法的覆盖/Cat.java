package com.day016.方法的覆盖;

/**
 * 猫科类
 * com.继承 Animal 类
 */
public class Cat extends Animal {

    // 方法的重写的时候，由于Animal 类中的访问级别是公开的，所以你想要进行重写，此时的访问权限不能更低；
    public void move(){
        System.out.println("Cat is moving");
    }
}
