package 博客练习代码.克隆.深克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:52 上午
 * @version 1.0
 */

import 博客练习代码.克隆.浅克隆.Student;

/**
 * 下面测试的是深拷贝
 *      深拷贝就是对象里面的所有引用也是全部进行拷贝
 */
public class MyClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepStudent student1 = new DeepStudent(1,"jack",new Teacher(1,"teacher1"));
        DeepStudent student2 = (DeepStudent) student1.clone();

        student2.setTeacher(new Teacher(2,"teacher2"));
        System.out.println(student2);
        System.out.println(student1);
    }
}
