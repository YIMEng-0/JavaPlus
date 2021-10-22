package com.day016.多态;

// 猫类

public class Cat extends Animal{
    public void move(){
        System.out.println("Cat is moving!");
    }

    // 不是从父类中继承过来的方法，是自己本身的方法
    // 子类对象所特有的，不是所有的动物都有此行为
    public void catchMouse(){
        System.out.println("Cat is catching mouse!");
    }

    public void eat(){
        System.out.println("Cat is eating!");
    }
}
