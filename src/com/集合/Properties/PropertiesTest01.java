package com.集合.Properties;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/3 2:58 下午
 */

import java.util.Properties;

/**
 * Properties
 *  是一个 Map com.集合，继承了 HashTable,里面的键值对都是 String 类型
 *  Properties 是一个属性类对象；
 *
 *  Properties 是线程安全的；
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // 掌握 Properties 方法中的存取即可
        // setProperty
        // getProperty
        properties.setProperty("url","www.test.com");
        properties.setProperty("username","root");
        properties.setProperty("password","123");

        // 通过 key 进行value 的获取
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
}
