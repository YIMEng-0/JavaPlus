package com.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/17 11:18 下午
 */

import java.io.FileReader;
import java.util.Properties;

/**
 * 验证反射机制的灵活性：
 *      java 代码在书写了一遍之后，在不改变原来的 Java 源代码的基础上面，可以做到对象的实例化，是比较灵活的，比较方便的；
 *
 *      对于扩展开放，符合 OCP 开闭原则：对扩展开放，对修改关闭
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        // 使用 IO 流进行文件的读取 classinfo.properties 文件
        FileReader reader = new FileReader("src/classinfo.properties");

        // 创建属性类对象 pro
        Properties pro = new Properties(); // key value 在 properties 中是这样子组织的

        // 加载
        pro.load(reader);

        // 关闭流
        reader.close();

        // 通过 key 获取 value
        String classname =  pro.getProperty("className");
        // 获取到了类的名字，进行打印输出
        System.out.println(classname);

        // 通过反射机制进行对象的实例化
        Class c = Class.forName(classname);

        Object obj = c.newInstance();
        System.out.println(obj);
    }
}