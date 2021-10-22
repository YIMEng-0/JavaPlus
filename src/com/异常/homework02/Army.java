package com.异常.homework02;

import java.nio.file.Watchable;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:09 下午
 */
// 类在强制类型转换的过程中，如果类转换成为接口；
// 类和接口之间可以不是继承关系，Java 是允许这样子的操作的
public class Army {
    // 武器数组
    private Weapon[] weapons;

    public Army(int count) {
        // 动态的初始化数组，每一个元素的位置都是 null
        // 武器数组有了之后，但是武器没有进行存放
        weapons = new Weapon[count];
    }

    // 将武器加入到武器库中
    public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundException {
        for (int i = 0; i < weapons.length; i++) {
            if (null == weapons[i]) {
                weapons[i] = weapon;
                System.out.println(weapon + " ：添加成功！");
                return; // 到了这里枪支添加就已经完成了，不需要后面的代码执行了，直接方法体进行结束执行
                // break 结束当前的循环执行，后面的代码没有影响
                // continue 结束此次循环，后面的循环没有受到影响
            }
        }

        // 程序执行到了这个地方，说明没有添加成功
        // 进行异常的上抛
        throw new WeaponIndexOutOfBoundException("武器数量已经达到上限");
    }

    // 所有可以攻击的武器攻击
    // 所有可攻击的都攻击
    public void attackAll() {
        // 找到可以进行攻击的武器
        // instanceof 左边的对象是否是它右边的类的实例，返回 boolean 的数据类型
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shootable) {

                // 调用了子类中特有的方法，使用了向下转型的方法
                Shootable shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }

    // 让所有的武器进行移动
    // 所有可移动的都移动
    public void moveAll() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Moveable) {
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
