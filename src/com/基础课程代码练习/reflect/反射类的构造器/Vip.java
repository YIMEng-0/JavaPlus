package com.基础课程代码练习.reflect.反射类的构造器;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/21 9:54 下午
 */
public class Vip {
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }
}
