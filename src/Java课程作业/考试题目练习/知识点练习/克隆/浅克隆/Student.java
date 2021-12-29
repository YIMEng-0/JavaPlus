package Java课程作业.考试题目练习.知识点练习.克隆.浅克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:55 上午
 * @version 1.0
 */
public class Student implements Cloneable{
    private int id;
    private String name;
    private Teacher teacher;

    public Student(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // 这里调用的 clone 方法是 Object 类里面的本地方法，可以实现快速的克隆，代码是封装起来的
    // 原本 Student 类是没有继承其他的数据类型的，但是它的父类一定是 Object ，所以super 一下，使用
    // 本地方法栈进行克隆的实现
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 本地方法栈实现克隆
    }

    @Override
    public String toString() {
        return "DeepStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
