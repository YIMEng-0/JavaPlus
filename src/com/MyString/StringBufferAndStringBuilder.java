package com.MyString;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/14 10:42 上午
 */
public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(10);
        stringBuilder.append("helle");
        System.out.println(stringBuilder);
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        stringBuilder.insert(6,"java");
        System.out.println(stringBuilder);
        stringBuilder.delete(8,10);
        System.out.println(stringBuilder);

//        考虑到线程的安全，使用StringBuffer

        StringBuilder sBuffer = new StringBuilder("菜鸟教程官网:");
        sBuffer.append("www.");
        sBuffer.append("runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}


