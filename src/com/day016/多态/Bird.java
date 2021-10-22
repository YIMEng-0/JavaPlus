package com.day016.多态;

public class Bird extends Animal{
    public void move(){
        System.out.println("Bird is moving!");
    }

    /**
     * 子类特有的行为以及动作
     */

    public void fly(){
        System.out.println("Bird is flying!");
    }
}
