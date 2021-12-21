package Java课程作业.考试题目练习.按照要求解答下列问题.运动员类设计;

import java.util.Objects;

/**
 * @author Doraemon
 * @date 2021/12/18 9:45 下午
 * @version 1.0
 */
public class Scores {
    private double difficulty;  //难度系数
    private double[] scores;    //裁判打分
    private double min;         //最低分
    private double max;         //最高分
    private double finalScore;  //最后得分


    // 进行分数类的创建，传递分数以及难度系数
    public Scores(double difficulty, double[] scores) {
        this.difficulty = difficulty;
        this.scores = scores;
    }

    public Scores(double difficulty, double v, double v1, double v2, double v3, double v4) {
    }

    /**（1）写出构造器，构造类中的域。传入的参数是难度系数和裁判打分,并符合main方法中的调用要求。
     (Write a constructor that constructs the fields in the class. The parameters passed
     in are the difficulty factor and the referee's score, and conform to
     the call requirements in the main method.)
     */


    private double minScore() {
        //（2）计算最低分

        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }

        return min;
    }

    private double maxScore() {
        //（3）计算最高分
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        return max;
    }


    private double finalScoreAlg() {
        //（4）计算最后得分
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            if (min == scores[i]) {
                scores[i] = 0;
            }

            if (max == scores[i]) {
                scores[i] = 0;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        finalScore = sum * difficulty;
        return finalScore;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getFinalScore() {
        return finalScore;
    }

    // equals() 方法以及 hashCode() 方法的重写，判断出来两个不同的实例
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scores scores = (Scores) o;
        return Double.compare(scores.finalScore, finalScore) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(finalScore);
    }
}