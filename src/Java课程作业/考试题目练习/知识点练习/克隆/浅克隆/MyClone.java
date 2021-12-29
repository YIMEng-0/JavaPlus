package Java课程作业.考试题目练习.知识点练习.克隆.浅克隆;

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
        System.out.println("浅克隆");
        Student student1 = new Student(1, "jack", new Teacher(1, "teacher1"));
        try {
            Student student2 = (Student) student1.clone();

            // 测试基本数据类型
            student2.setId(2);
            student2.setName("jack2");

            // 测试引用数据类型，发现一个改变了，另外一个也会改变
            Teacher teacher = student2.getTeacher();
            teacher.setName("teacher2");
            teacher.setId(2);
            /**
             * 通过结果就可以发现，修改被克隆对象的基本类型和String类型不会对原来数据造成影响，
             * 但是由于用的是同一个引用地址，修改对象时两边都会被修改。
             */
            System.out.println(student1);
            System.out.println(student2);

            /**
             * 浅克隆
             * DeepStudent{id=1, name='jack', teacher=Teacher{id=1, name='teacher2'}}
             * DeepStudent{id=2, name='javayz2', teacher=Teacher{id=1, name='teacher2'}}
             */
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
