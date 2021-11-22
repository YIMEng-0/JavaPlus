package com.基础课程代码练习.注解.annotation4;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/23 3:37 下午
 */
public class OtherAnnotationTest {
    @OtherAnnotation(age = 18,email = {"123","456","789"},seasonArray = Season.SPRING)
    public void doSome() {

    }

    // 如果在数组中只有一个元素的话，是可以省略掉大括号的
    // 一个元素直接写上去一个元素即可
    @OtherAnnotation(age = 18,email = "123",seasonArray = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER})
    public void doOther() {

    }
}
