package Java课程作业.考试题目练习.按照要求解答下列问题.运动员类设计;

/**
 * @author Doraemon
 * @date 2021/12/18 9:56 下午
 * @version 1.0
 */
public class TestScores {
    public static void main(String[] args) {
        Match[] match = new Match[3];
        double[] first = {9.1, 8.2, 7.3, 8.4, 8.6};
        double difficulty = 1.98;
        Scores s1 = new Scores(difficulty, first);
        Athlete a1 = new Athlete("John Hill", "0001");
        match[0] = new Match(a1, s1);
        Scores s2 = new Scores(2.01, 9.0, 8.5, 8.1, 9.0, 8.0);
        Athlete a2 = new Athlete("Alun Karl", "0002");
        match[1] = new Match(a2, s2);
        match[2] = new Match("Lin Ma", "0003", 1.80, 7.0, 8.5, 7.1, 9.0, 8.0);

        // 实现按照姓名以及 lambda 表达式进行排序操作
    }
}