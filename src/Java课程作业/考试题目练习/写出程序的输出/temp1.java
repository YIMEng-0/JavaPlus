package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 12:29 下午
 * @version 1.0
 */

/**
 * 语法
 * 该方法有以下几种语法格式：
 *
 * static Integer valueOf(int i)
 * static Integer valueOf(String s)
 * static Integer valueOf(String s, int radix)
 * 参数
 * i -- Integer 对象的整数。
 * s -- Integer 对象的字符串。
 * radix --在解析字符串 s 时使用的基数，用于指定使用的进制数。
 */
public class temp1 {
    public static void main(String[] args) {
        String s1 = "235";
        String s2 = "10";

        // 首先是两个字符串的拼接 然后得到其确定值
        Integer value = Integer.valueOf(s1 + s2); // 23510 Integer 对象的字符串 Integer.value() 得到 Integer 类型字符串
        value -= 10;  // 因为是 Integer 对象，所以在这里是可以进行减法的
        System.out.println(value); // 23500
    }
}
