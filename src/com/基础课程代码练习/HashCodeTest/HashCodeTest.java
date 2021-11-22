package com.基础课程代码练习.HashCodeTest;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/13 9:45 下午
 */
public class HashCodeTest {
    public static void main(String[] args) {
        int hash= 0;
        String s= "ok";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(s.hashCode() + "  " + sb.hashCode());

        String t = new String("ok");
        StringBuilder tb =new StringBuilder(s);
        System.out.println(t.hashCode() + "  " + tb.hashCode());
    }
}