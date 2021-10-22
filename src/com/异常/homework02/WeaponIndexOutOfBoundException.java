package com.异常.homework02;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 9:42 下午
 */

// 武器的索引异常，添加失败的时候抛出异常
public class WeaponIndexOutOfBoundException extends Exception{
    public WeaponIndexOutOfBoundException() {

    }

    public  WeaponIndexOutOfBoundException(String s) {
        super(s);
    }
}
