package com.reflect.反射类的构造器;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 9:54 下午
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 反编译一个类的构造方法
 */
public class ReflectConstructor {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class vipClass = Class.forName("java.lang.String");
        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append("{\n");

        // 拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");

            // 实现参数的拼接
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }

            // 删除最后下标位置上面的字符
            if (parameterTypes.length > 0) {
                s.deleteCharAt(s.length()-1);
            }
            s.append("){}\n");
        }


        s.append("}");

        System.out.println(s);
    }
}
