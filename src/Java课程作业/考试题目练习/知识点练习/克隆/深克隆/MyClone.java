package Java课程作业.考试题目练习.知识点练习.克隆.深克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:52 上午
 * @version 1.0
 */

/**
 * 下面测试的是深拷贝
 *      深拷贝就是对象里面的所有引用也是全部进行拷贝
 */
public class MyClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("深克隆");

        // 创建一个测试对象，再创建这个对象的克隆对象
        DeepStudent student1 = new DeepStudent(1, "jack", new Teacher(1, "teacher1"));
        DeepStudent student2 = (DeepStudent) student1.clone();

        // 测试基本数据类型
        student2.setId(2);
        student2.setName("jack2");

        // 测试自定义引用数据类型，发现一个改变了，另外一个没有受到影响，说明是深度克隆成功了，不是简单的克隆地址，底层也是克隆了
        Teacher teacher = student2.getTeacher();
        teacher.setName("teacher2");

        System.out.println(student1);
        System.out.println(student2);
        /**
         * DeepStudent{id=1, name='jack', teacher=Teacher{id=1, name='teacher1'}}
         * DeepStudent{id=2, name='javayz2', teacher=Teacher{id=1, name='teacher2'}}
         */
    }
}
