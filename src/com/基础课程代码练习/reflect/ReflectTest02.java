package com.基础课程代码练习.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/17 11:00 下午
 */

/**
 * 1、普通的 new 创建对象
 *
 *
 * 2、使用了反射机制创建出来的对象
 *      通过使用了 Class newInstance() 方法进行实例化对象；
 *      注意：newInstance() 的内部在实际上是调用了 无参数构造的方法；
 *
 * 反射机制的灵活性的体现：
 *      为什么灵活？
 *
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        // 通过反射机制可以获取 Class,获取到了 Class 文件之后，可以实例化对象
        try {
            Class c = Class.forName("com.基础课程代码练习.reflect.bean.User");
            Object obj = c.newInstance(); // 底层调用了类的无参数构造方法，完成对象的创建 newInstance 调用的是无参数构造方法，必须保证无参数构造方法
            System.out.println(obj); // com.反射机制.bean.User@2503dbd3 创建出来了对象

            // java 虚拟机会提供默认的无参数构造方法在自己没有创建构造方法的时候

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
