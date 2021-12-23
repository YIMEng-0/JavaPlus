package temp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doraemon
 * @date 2021/12/17 10:11 上午
 * @version 1.0
 */
public class Temp2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void swap(int a, int b) {
        System.out.println("in: " + a);
        System.out.println("in: " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("inn: " + a);
        System.out.println("inn: " + b);
    }
}