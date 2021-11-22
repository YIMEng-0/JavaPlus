package com.基础课程代码练习.异常.homework02;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:05 下午
 */
// 高射炮只能射击，不能移动
public class GaoShePao extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("高射炮开跑！！！");
    }
}
