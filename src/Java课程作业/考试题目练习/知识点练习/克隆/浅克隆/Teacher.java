package Java课程作业.考试题目练习.知识点练习.克隆.浅克隆;

/**
 * @author Doraemon
 * @date 2021/12/14 8:54 上午
 * @version 1.0
 */
public class Teacher {
    private int id;
    private String name;

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

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
