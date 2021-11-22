package com.基础课程代码练习.day016.多态;

/**
 *  软件的升级 进行功能的扩展
 *  面向抽象的编程 耦合度低 可以扩展型比较强
 *
 *  核心：面向抽象编程 不要面向具体编程 升级方便
 */
public class MasterCatFeed {
    public static void main(String[] args) {
        // 创建主人对象
        // 创建宠物猫对象
        // 人对于猫进行喂养


        // 这种方式没有使用多态机制 导致程序的更新的能力比较弱
        // 创建需要的各个对象
        // 创建出来新的对象
        Cat Tom  = new Cat();
        Master master = new Master();
        Dog Jack = new Dog();
    }
}
