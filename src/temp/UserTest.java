package temp;

/**
 * @author Doraemon
 * @date 2021/11/18 10:26 上午
 * @version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        // 使用了静态工厂进行类的创建
        User testUser = User.newTestInstance();
        System.out.println(testUser.age);
        System.out.println(testUser.name);
        System.out.println(testUser.description);
    }
}
