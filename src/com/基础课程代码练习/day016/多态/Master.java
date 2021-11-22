package com.基础课程代码练习.day016.多态;

/**
 *  主人类
 */
public class Master {
    /**
     *  喂养宠物
     */

    // 想办法相抵程序之间耦合度，使得扩展性得到一定的提升
/*    public void feedCat(Cat cat){
        cat.eat();
    }

    public void feedDog(Dog dog){
        dog.eat();
    }*/

    public void feed(Pet pet){ // Pet pet 是一个父类的引用
        pet.eat();
    }

}
