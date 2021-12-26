package Java课程作业.考试题目练习.写出程序的输出;

import java.math.BigDecimal;

/**
 * @author Doraemon
 * @date 2021/12/18 7:31 下午
 * @version 1.0
 */

/**
 * https://blog.csdn.net/qq_35868412/article/details/89029288
 *
 * BigDecimal.valueOf() 可以做到比较精确的数据的转换，使得计算机中精确的表示金钱的数量，不会造成损失
 *
 * 注意字符串和双精度浮点数字之间的区别，两者是不同的
 */
public class temp6 {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0.05"); // 字符串传递进去的是精确的
        BigDecimal f2 = new BigDecimal("0.01");
        BigDecimal f3 = BigDecimal.valueOf(0.06); // BigDecimal(double) 创建出来的数字不是精确地，但是使用了 valueOf() 创建出来的精确了；
        BigDecimal f4 = new BigDecimal(0.01); // double 传进去创建出来的是不精确的，这里没有 valueOf() 不精确
        System.out.println(f2.equals(f4)); // false
        System.out.println(f3.equals(f1.add(f2))); // true
    }
}