package temp;

import java.util.Arrays;
import java.util.Scanner;

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

        /**
         * 1、new对象型，并指定初始长度
         * int[] arr = new int[5]； // 创建长度为5 的数组
         *
         * 2、直接初始化特定值型
         * int[] arr = {1,2,3,4}；
         *
         * 3、new对象+初始化值型
         * int[] arr = new int[]{1,2,3,4}；
         */

        String[] strings = {"1", "2"};
        int[] intArr0 = {1, 2, 3};
        int[] intArr1 = new int[]{1, 2, 3, 4, 5};
        int[] intArr2 = new int[3]; // 进行数组的初始化，将所有的元素初始化为 0
        String[] stringArr = new String[3]; // 数组的初始化，将所有的元素初始化为 null

        System.out.println("==================");
        System.out.println(intArr0.length);
        System.out.println(intArr1.length);
        System.out.println(intArr2.length);

        for (int i = 0; i < intArr2.length; i++) {
            System.out.println(intArr2[i]);
        }

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }

        System.out.println("=============");
        int[] inin = {1, 2, 3, 4, 5, 5, 6};
        int[] c = Arrays.copyOf(inin, 20);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        int[] d = new int[100];
        Arrays.fill(d, 10);
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        /**
         * 不同于 String 类，String 由于实现了常量池 所以 new 和不 new 有区别:
         *      new的话，引用变量指向堆区;
         *      不new的话，引用变量指向常量池;
         *
         * 对于数组的定义，初始化时用new与不用new没区别，只是两种方式罢了
         *      因为数组是引用数据类型，建立对象时，无论用不用new，数组实体都是放在堆内存中，引用变量放在栈内存;
         */

        System.out.println("==========");
        Scanner scanner = new Scanner(System.in);
        String k = scanner.next();
        System.out.println(k);

    }
}