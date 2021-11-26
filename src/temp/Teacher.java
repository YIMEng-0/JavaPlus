package temp;

/**
 * @author Doraemon
 * @date 2021/11/25 10:22 上午
 * @version 1.0
 */
public class Teacher {

    public Teacher(String s){
        System.out.println("父类构造器里面的字符串" + s);
        System.out.println("我是一名人民教师。");
    }
}

class Student extends Teacher {
    public Student(){
        super("ok");
        System.out.println("我是一名学生。");
    }

    public static void main(String[] args) {
        Student s = new Student();

    }
}
