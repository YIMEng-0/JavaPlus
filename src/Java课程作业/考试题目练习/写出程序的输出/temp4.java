package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 12:41 下午
 * @version 1.0
 */

/**
 * ~ 表示非运算符，位运算的时候，将所有的位进行取反即可
 *
 * int 32 位 向着左边移动三位即可
 */
public class temp4 {
    public static void main(String[] args) {
        int i = 8 << 3;
        System.out.println(i); // 64
        System.out.println(i & ~1 << 16); // 0
    }
}
