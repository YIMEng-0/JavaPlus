package com.异常.homework02;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:08 下午
 */
// 物资飞机，只能移动，不能射击
public class WuZiFeiJi extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞");
    }
}
