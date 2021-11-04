package temp;

import java.util.Random;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/4 10:25 上午
 */
public class temp2 {
    public static void main(String[] args) {
        System.out.println(-8 << 28);
        int num = 1;
        System.out.println(num << 10);
        System.out.println(Math.pow(2, 10));

        System.out.println(Integer.toBinaryString(1024)); // 100 00000000
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 10));
            Random ran1 = new Random(1024);
            for (int j = 0; j < 10; j++) {
                System.out.println(ran1.nextInt(100) + " ");
            }
        }
//        1000 1000
//        00000000 00000000 00000100 00000000
    }
}
