package temp;

/**
 * @author Doraemon
 * @date 2021/11/18 10:25 上午
 * @version 1.0
 */
public class User{
    String name ;
    int age ;
    String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static User newTestInstance() {
        User tester = new User();
        tester.setName("隔壁老张");
        tester.setAge(16);
        tester.setDescription("我住隔壁我姓张！");
        return tester;
    }
}