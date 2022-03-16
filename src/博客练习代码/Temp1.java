package 博客练习代码;

import java.net.MalformedURLException;
import java.util.*;

/**
 * @author Doraemon
 * @date 2022/1/29 2:23 下午
 * @version 1.0
 */
public class Temp1 {
    private int num1; // 同类中使用


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int right = arr.length - 1;
        arr[right--] = 8;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}