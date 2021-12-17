package 博客练习代码.克隆.浅克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:52 上午
 * @version 1.0
 */

/**
 * 下面测试的是浅拷贝
 *      基本类型可以直接拷贝值
 *      String 不改变的时候，拷贝的是引用地址，值改变的时候，值是会发生改变的
 *      对于对象，拷贝的是对象的引用地址；
 *
 *      对于基本类型以及 String ,克隆的改变，原始的东西不会改变的；
 *      对于对象克隆的改变是会改变的；
 */
public class MyClone {
    public static void main(String[] args) {
        Student student1 = new Student(1, "jack", new Teacher(1, "teacher1"));
        try {
            Student student2 = (Student) student1.clone();

            student2.setId(2);
            student2.setName("Tom");
            Teacher teacher = student2.getTeacher();

            System.out.println(student1);
            System.out.println(student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
