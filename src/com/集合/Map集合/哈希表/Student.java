package com.集合.Map集合.哈希表;

import java.util.Objects;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/2 10:27 下午
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    // 此时的 HashCode equals 都没有重写


    // 如果判断出来的学生的名字是一样的，表示为同一个学生
    // this 的理解，表示当前的对象


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
