package com.reflect;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/18 7:58 下午
 */

import com.sun.javafx.geom.RectBounds;

import java.util.ResourceBundle;

/**
 * 资源绑定器，方便获取属性文件中的内容
 *      使用下面的方式的时候 xxx.properties 只能放在类路径的下面，在其他的地方都是不允许的；
 *
 */
public class ResourceBoundTest {
    public static void main(String[] args) {

        // 资源绑定器，只能绑定 xxx.properties 文件，并且这个文件必须在类路径下面，文件扩展名字必须是：properties;
        // 在写类的路径的时候，后面的扩展名字也是不写的；
        // properties 是不写的；在其他的类文件的时候，com/java/db 就行，不需要其他的相关的操作
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");

        String className = bundle.getString("className");
        System.out.println(className);

        System.out.println("Hello world!!!");
    }
}