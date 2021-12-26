package temp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Doraemon
 * @date 2021/12/16 8:08 下午
 * @version 1.0
 */
public class temp1<T> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        while (scanner.hasNextDouble()) {
            double str = scanner.nextDouble();
            System.out.println("输入的双精度数字是：" + str);
        }



        int[] a = {1,2,3,4};
        int[] c;
        c = Arrays.copyOf(a,a.length);
        for (int j = 0; j < c.length - 2; j++) {
            System.out.println(c[j]);
        }

        System.out.println("------");
        Arrays.fill(c,0,2,22);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        System.out.println(Math.pow(2,-127));
    }
}
