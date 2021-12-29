package Java课程作业.考试题目练习.知识点练习;

/**
 * @author Doraemon
 * @date 2021/12/29 8:38 下午
 * @version 1.0
 */

import java.util.Arrays;
import java.util.Comparator;

//用Arrays中的sort()对数组进行排序
public class 比较器测试 {
    //年龄比较器
    // Comparator 比较器可以使得比较的方式更加的多元化，更加的灵活
    // 使用了匿名类的形式，可以使得代码变得简单一些
    // 父类 父类的引用 = new Comparator<> {}; 等号的右边是匿名类，左边是它的父类以及父类的引用

    /**
     * 匿名类的使用
     *  1、创建匿名类对象
     *  2、通过匿名类继承一个父类
     *  3、通过匿名类实现一个接口，下面的两个比较器的代码就是实现了一个接口
     */


    Comparator<student> comparatorAge = new Comparator<student>() {
        @Override
        public int compare(student p1, student p2) {
            if (p1.getAge() > p2.getAge()) {
                return 1;
            } else if (p1.getAge() < p2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }; // 表达式的形式定义的，所以在后面是一个封号

    // 成绩比较器
    // 使用了匿名类的形式，可以使得代码变得简单一些
    // 父类 父类的引用 = new Comparator<> {}; 等号的右边是匿名类，左边是它的父类以及父类的引用
    Comparator<student> comparatorGrade = new Comparator<student>() {
        @Override
        public int compare(student p1, student p2) {
            if (p1.getGrade() > p2.getGrade()) {
                return 1;
            } else if (p1.getGrade() < p2.getGrade()) {
                return -1;
            } else {
                return 0;
            }
        }
    };// 表达式的形式定义的，所以在后面是一个封号

    public student[] ageSort(student[] s) {
        // 在这里进行排序的时候，将比较器传递进去，比较器是自己可以单独创建的
        // 传递了两个参数，第一个是等待排序的数组，第二个是定义的比较规则，真正在比较的时候，根据数据类型，找到其比较器，进行排序
        Arrays.sort(s, comparatorAge);
        return s;
    }

    public student[] gradeSort(student[] s) {
        Arrays.sort(s, comparatorGrade);
        return s;
    }

    public static void main(String[] args) {
        比较器测试 tt = new 比较器测试();
        student p1 = new student();
        p1.setAge(10);
        p1.setName("p1");
        p1.setGrade(98);

        student p2 = new student();
        p2.setAge(30);
        p2.setName("p2");
        p2.setGrade(70);

        student p3 = new student();
        p3.setAge(20);
        p3.setName("p3");
        p3.setGrade(83);

        student p4 = new student();
        p4.setAge(15);
        p4.setName("p4");
        p4.setGrade(80);

        student[] list = {p1, p2, p3, p4};

        student[] agePrint = tt.ageSort(list);
        for (student ss : agePrint) {
            System.out.println("student age sort ," + ss.getName() + "  " + ss.getAge() + " " + ss.getGrade());
        }//按年龄排序

        student[] gradePrint = tt.gradeSort(list);
        for (student ss : gradePrint) {
            System.out.println("student grade sort ," + ss.getName() + "  " + ss.getAge() + " " + ss.getGrade());
        }//按成绩排序

    }

}

//创建一个类型，用于比较的引用对象类型
class student {
    private String name;
    private int age;
    private float grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGrade() {
        return grade;
    }
}