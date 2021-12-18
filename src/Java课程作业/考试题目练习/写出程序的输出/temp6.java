package Java课程作业.考试题目练习.写出程序的输出;

import java.math.BigDecimal;

/**
 * @author Doraemon
 * @date 2021/12/18 7:31 下午
 * @version 1.0
 */

/**
 * https://blog.csdn.net/qq_35868412/article/details/89029288
 */
public class temp6 {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = new BigDecimal("0.01");
        BigDecimal f3 = BigDecimal.valueOf(0.06); // double 创建出来的数字不是精确地，但是使用了 valueOf() 创建出来的精确了；
        BigDecimal f4 = new BigDecimal(0.01); // double 传进去创建出来的是不精确的，
        System.out.println(f2.equals(f4)); // false
        System.out.println(f3.equals(f1.add(f2))); // true
    }
}
