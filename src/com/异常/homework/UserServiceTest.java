package com.异常.homework;

import com.MyString.User;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 8:43 下午
 */
public class UserServiceTest {
    public static void main(String[] args) {
        // 创建UserService 对象
        UserService userService = new UserService();
        try {
            userService.register("jackAndTom","123456");
        } catch (IllegalNameException e) {
            e.printStackTrace();
        }
    }
}
