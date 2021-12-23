package Java课程作业.考试题目练习.按照要求解答下列问题.参考答案的运动员类的设计;

/**
 * @author Doraemon
 * @date 2021/12/22 8:58 下午
 * @version 1.0
 */

import java.util.Arrays;

public class Scores {
    private double difficulty;
    private double[] scores;
    private double min;
    private double max;
    private double finalScore;

    public Scores(double d, double... s) {
        difficulty = d;
        scores = s;
        min = minScore();
        max = maxScore();
        finalScore = scoresAlg();
    }

    private double minScore() {
        double[] d = scores.clone();
        Arrays.sort(d);
        return d[0];
    }

    private double maxScore() {
        double[] d = scores.clone();
        Arrays.sort(d);
        return d[d.length - 1];
    }

    private double scoresAlg() {
        double[] d = scores.clone();
        Arrays.sort(d);
        double sum = 0.0;
        for (int i = 1; i < d.length - 1; i++) {
            sum += d[i];
        }
        return sum * difficulty;
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
}


