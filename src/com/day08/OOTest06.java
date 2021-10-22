package com.day08;

/*
    使得学生和电脑建立联系
 */

public class OOTest06 {
    public static void main(String[] args){
        // 创建学生对象
        // 保存对象的引用 叫做引用变量
        // 垃圾回收器会将没有引用的对象进行释放内存
        Student student = new Student();

        Computer computer = new Computer();

        computer.brand = "apple";
        computer.color = "Red";
        computer.style = "M1";
        student.notePad = computer;
        System.out.println(student.notePad.brand);
        System.out.println(student.notePad.color);
        System.out.println(student.notePad.style);
    }
}

class Student{
    int no;
    String name;
    Computer notePad;

}

class Computer{
    String brand;
    String style;
    String color;

}
