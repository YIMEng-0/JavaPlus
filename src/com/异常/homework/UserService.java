package com.异常.homework;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 8:29 下午
 */
// 用户业务类，处理用户的相关业务：比如登陆，注册等功能
public class UserService {
    /**
     * 用户注册
     * @param username 用户名字
     * @param password 用户密码
     * @throws IllegalNameException 当用户名字为 空 的时候，或者长度没有符合一定的长度的时候，进行错误的报出
     */
    // 自己抛出来的自己捕捉，没有意义，可以上抛，进行处理
    public void register(String username, String password)throws IllegalNameException {
        /**
         * 引用等于 null 的判断最好是在所有判断的最前面
         */

        /**
         * 习惯上来讲 null == username ; 比 username == null 要好一些
         */
        if (null == username || username.length() >15 || username.length() < 6){
            throw new IllegalNameException("用户名非法，长度在 6 到 15 之间");
        }

        // 程序可以执行到这个地方的时候，说明程序是合法的
        System.out.println("注册成功，欢迎: " + username);
    }
}
