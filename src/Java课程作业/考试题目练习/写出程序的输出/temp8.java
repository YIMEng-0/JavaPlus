package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 7:59 下午
 * @version 1.0
 */

/**
 * 考察了字符串的凭借
 *
 * 其他的数据类型和字符型的数据类型进行凭借的时候，是不会执行正常的 1 + 1 = 2 ；
 * 而是 "1" + "1" = "11" 因为是字符串拼接
 */
public class temp8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        String s = "x,y,z";
        System.out.println(s + x + y + z); // x,y,z102030
        s += "(summed)";

        // 使用了字符串的拼接，优先使用了括号几面的计算，由于括号里面都是整数，所以先整合了和运算得到了 60
        System.out.println(s + (x + y + z)); // x,y,z(summed)60
    }
}
