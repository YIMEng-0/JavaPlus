package com.基础课程代码练习.注解.annotation7;

import java.lang.reflect.Field;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 4:26 下午
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Class userClass = Class.forName("com.基础课程代码练习.注解.annotation7.User");

        // 判断类上面是否存在 @Id 注解
        if (userClass.isAnnotationPresent(Id.class)) {
            // 有 @id 注解的时候，类必须有 int 类型的属性，没有报告异常

            // 获取类的属性
            Field[] fields = userClass.getDeclaredFields();
            boolean isRight = false;
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    // 表示类是合法的类，存在@Id 注解，有了@Id 注解，必须有 int 类型的 id
                    isRight = true;
                }
                break;
            }

            // 判断是否合法
            if (!isRight) { // 不合法了退出来了循环之后
                throw new NotHasPropertyException("被@Id 标注的类必须有 int 类型的 Id 属性");
            }
        }
    }
}