package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 12:32 下午
 * @version 1.0
 */

/**
 * 一、switch语句中。二、循环语句。
 *
 * break 在 switch 里面运行结束分支，结束分支
 * break 在 循环里面，直接退出当前的循环，下面的语句是不会执行的
 */
public class temp2 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }

            // 下面的执行不了，也就是不能进行输出了
            System.out.println(x); // 10 20
        }
    }
}
