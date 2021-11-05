package temp;

import java.util.Scanner;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/5 10:00 上午
 */
public class ClassJava {
    public static void main(String[] args) {
        /**
         * 使用了 = 进行字符串类型与 new 出来的字符串是不同的东西，new 会创建对象， = 只是会将字符串放在了字符串常量池中
         *
         */

        Integer a = 300;
        Integer b = 300;
        System.out.println(a.equals(b));
        tetest();
    }

    public static void tetest() {


        Integer integer1 = 127;
        Integer integer2 = 127;

        if (integer1 == integer2) {
            System.out.println("integer1:  " + integer1 + " == integer2: " + integer2);
        } else {
            System.out.println("integer1:  " + integer1 + " != integer2: " + integer2);
        }

        Integer integer3 = 128;
        Integer integer4 = 128;

        if (integer3 == integer4) {
            System.out.println("integer3:  " + integer3 + " == integer4: " + integer4);
        } else {
            System.out.println("integer3:  " + integer3 + " != integer4: " + integer4);
        }


        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        System.out.println(s1);
    }
}
