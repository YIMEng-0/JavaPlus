package com.reflect.反射属性;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/20 8:43 下午
 */

import java.lang.reflect.Field;

/**
 * 反射以下属性：
 * Field
 * <p>
 * 反射 Student 中所有的 Field
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        // 获取类先
        try {
            Class studentClass = Class.forName("com.reflect.反射属性.Student");

            // 获取类中所有的 Field
            Field[] fields = studentClass.getFields(); // 获取的是所有的 public 属性，其他的属性是获取不到的；

            System.out.println(fields.length); // 测试的数组中只有一个元素
            for (Field f : fields) {
                System.out.println(f.getName());
            }

            // 获取所有的 Fields
            Field[] fields1 = studentClass.getDeclaredFields(); // 得到了得到具体的所有的字段的名字
            System.out.println("----------");
            for (Field f : fields1) {
                // 获取属性的类型
                System.out.println(f.getType());

                // 获取属性的修饰符列表
                System.out.println("修饰符是：" + f.getModifiers());

                System.out.println(f.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
