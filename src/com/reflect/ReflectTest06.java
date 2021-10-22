package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/20 9:07 下午
 */
public class ReflectTest06 {
    public static void main(String[] args) {
        // 进行字符串的拼接操作
        StringBuilder s = new StringBuilder();

        // 下面的操作，使用的反编译的操作，拿到了字节码文件，可以通过字节码文件，得到原始的编程的内容，使用了反射机制
        try {
            Class studentClass = Class.forName("java.lang.Thread");

            s.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + "{\n");
            Field[] fields = studentClass.getDeclaredFields();

            for (Field field : fields) {
                s.append("\t");
                s.append(Modifier.toString(field.getModifiers()));
                s.append(" ");
                s.append(field.getType().getSimpleName());
                s.append(" ");
                s.append(field.getName());
                s.append(";\n");
            }

            s.append("}");

            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
