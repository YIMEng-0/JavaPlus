package com.基础课程代码练习.异常.homework02;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:07 下午
 */

// 战斗机，可以进行移动和射击
public class Fighter extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮！！！");
    }
}
