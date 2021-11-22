package com.基础课程代码练习.异常.homework02;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:03 下午
 */

// 坦克是一个武器，可以进行移动，可以进行射击
public class Tank extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("坦克在移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克在射击！！！");
    }
}
