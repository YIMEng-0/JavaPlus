package temp;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/5 11:05 上午
 */
public class Temp3 {
    // 类级别的变量，可以直接在方法中进行值的改变
    private final static int num = 10;

    // 实例级别的变量，需要创建对象进行变量的赋值操作
    int num1 = 30;
    public static void main(String[] args) {
        int num = 20;
        System.out.println(num);
        System.out.println(Temp3.num);


        Temp3 temp3 = new Temp3();
        System.out.println(temp3.num1 = 99);
        int y = 1;

    }
}