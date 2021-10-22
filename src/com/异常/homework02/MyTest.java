package com.异常.homework02;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/26 3:32 下午
 */
public class MyTest {
    public static void main(String[] args) {
        // 构建军队
        // 军队中有四个武器
        Army army = new Army(6);

        // 创建武器对象
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
        GaoShePao gaoShePao = new GaoShePao();

        // 添加武器
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiFeiJi);
            army.addWeapon(gaoShePao);
        } catch (WeaponIndexOutOfBoundException e) {
            System.out.println(e.getMessage());
        }

        // 让所有可移动的移动
        army.moveAll();

        // 所有可以攻击的攻击
        army.attackAll();
    }
}
