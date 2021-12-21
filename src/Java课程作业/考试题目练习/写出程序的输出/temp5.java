package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 12:44 下午
 * @version 1.0
 */

/**
 * 考察了关于短路的 与 运算；
 * 只要有一个是假的，就进行短路处理，减少系统的开支，不会执行下面的东西；
 * 真的话就是会一直往下面判断下去，所有的条件都是真的时候，才会执行下面的语句；
 */
public class temp5 {
    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("expression is : " + b); // false
    }

    static boolean test1(int value) {
        System.out.println("test1("+value+")"); // test1(10)
        System.out.println("result:" + (value < 1)); // result:false

        return value < 1;
    }

    static boolean test2(int value) {
        System.out.println("test1("+value+")"); // test1(10)
        System.out.println("result:" + (value < 2)); // result:false

        return value < 2;
    }

    static boolean test3(int value) {
        System.out.println("test1("+value+")"); // test1(10)
        System.out.println("result:" + (value < 3)); // result:false

        return value < 3;
    }
}
