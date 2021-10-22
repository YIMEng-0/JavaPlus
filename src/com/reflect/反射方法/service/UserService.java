package com.reflect.反射方法.service;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 11:20 上午
 */

/**
 * 用户服务类
 */
public class UserService {
    /**
     * @param name  用户名字
     * @param password  用户密码
     * @return  true 表示登陆成功，false 表示登陆失败
     */
    public boolean login(String name,String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout() {
        System.out.println("系统已安全退出！");
    }

    public void login(int i) {

    }
}
