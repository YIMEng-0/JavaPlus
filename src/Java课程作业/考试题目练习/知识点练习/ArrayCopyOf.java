package Java课程作业.考试题目练习.知识点练习;

import java.util.Arrays;

/**
 * @author Doraemon
 * @date 2021/12/29 8:29 下午
 * @version 1.0
 */
public class ArrayCopyOf {

    public static void main(String[] args) {
        int a[] = {4, 3, 6, 5, 1, 2};

        // 拷贝到索引 4 ，下标是 4 的是得不到的，是一个开区间
        int b[] = Arrays.copyOf(a, 4);

        // 这是一个左闭右开的区间，左边是闭合的，右边是开放的
        int c[] = Arrays.copyOfRange(a, 2, 4 + 1);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // 下面使用一下排序的东西
        Arrays.sort(b);
        System.out.println("排序之后的结果是：");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);  // 输出的结果是按照从小到大的顺序排序的
        }
    }
}

