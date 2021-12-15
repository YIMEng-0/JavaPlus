package 博客练习代码.克隆.深克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:55 上午
 * @version 1.0
 */
public class DeepStudent implements Cloneable{
    private int id;
    private String name;
    private Teacher teacher;

    public DeepStudent(int id, String name, Teacher teacher) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // student 是复制后的对象
        // 调用了父类的 native 的克隆，把这个类里面的基本类型，String ，Student 里面的对象都进行克隆
        DeepStudent student = (DeepStudent) super.clone();

        // Teacher 里面也是实现了 Cloneable 方法的，可以实现拷贝的操作，在 teacher 类的里面将所有的内容进行拷贝一份
        // 进行深克隆，调用 teacher 里面的克隆方法，把对象里面的数据类型进行深拷贝；重新拷贝一个；
        student.teacher = (Teacher) teacher.clone();
        return student;
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
