package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 12:36 下午
 * @version 1.0
 */

/**
 * 两个知识点：
 *  1、使用的短路的或运算，前面真，后面就不需要考虑了；
 *  2、使用了自增运算符，先赋值，再增加；还是先增加后赋值，需要考虑清楚；
 *  3、一个 | 和 || 是有区别的，一个没有短路，两个是存在短路的；
 *
 *  一个的符号是没有短路的，两个的是存在短路的
 */
public class temp3 {
    public static void main(String[] args) {
        int ia = 10;
        int ib = 20;
        if (ia-- > 0 || ib++ > 0) {
            // 9 是 || 左边的代码 执行了，右边的代码没有执行，所以没有发生改变
            System.out.println("ia = " + ia + ", ib = " + ib); // ia = 9, ib = 20
        }
    }
}
