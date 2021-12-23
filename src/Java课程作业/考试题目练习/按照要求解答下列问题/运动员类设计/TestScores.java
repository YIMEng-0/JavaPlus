package Java课程作业.考试题目练习.按照要求解答下列问题.运动员类设计;

import java.util.Arrays;

/**
 * @author Doraemon
 * @date 2021/12/18 9:56 下午
 * @version 1.0
 */
public class TestScores {
    public static void main(String[] args) {
        // 创建  Match 数据类型的数组，里面的每一个元素就是一个 Match 类型
        Match[] match = new Match[3];
        double[] first = {9.1, 8.2, 7.3, 8.4, 8.6};
        double difficulty = 1.98;
        // 根据难度系数以及分数计算相关结果
        Scores s1 = new Scores(difficulty, first);
        Athlete a1 = new Athlete("John Hill", "0001");

        // 创建出来的多维数组，在初始数组的第一个位置里面存储指向一个比赛的堆内存空间
        // 比赛里面有运动员 a1 以及 分数 s1；运动员 a1 在程序的前面定义好，里面有 运行员的名字以及编号
        match[0] = new Match(a1, s1);

        // 在 Scores 类里面，创建可以接受多个参数的构造方法 double... a
        // 没有传递难度系数，计算出来为 0 ；

        Scores s2 = new Scores(9.0, 8.5, 8.1, 9.0, 8.0);
        s2.setDifficulty(2.01);
        Athlete a2 = new Athlete("Alun Karl", "0002");

        // 创建比赛 2 ,构造的时候，将运动员，分数进行传递
        match[1] = new Match(a2, s2);

        // 创建出来比赛 3 ，在构造函数里面将传递进去的数据进行保存即可
        match[2] = new Match("Lin Ma", "0003", 1.80, 7.0, 8.5, 7.1, 9.0, 8.0);

        System.out.println("s1 的最大数值是：" + s2.getMax());
        System.out.println("s1 的最小数值是：" + s2.getMin());
        System.out.println("s2 取得的分数是：" + s2.getFinalScore());

    }
}