package Java课程作业.考试题目练习.按照要求解答下列问题.参考答案的运动员类的设计;

/**
 * @author Doraemon
 * @date 2021/12/22 8:57 下午
 * @version 1.0
 */

/**
 * 在这里实现了 Comparable 接口，里面的数据类型是 Match
 * 就是将 Match 的数据类型进行了排序
 *
 * 泛型可以参数化类型
 */
public class Match implements Comparable<Match> {
    private Athlete athlete;
    private Scores scores;

    public Match(Athlete athlete, Scores scores) {
        this.athlete = athlete;
        this.scores = scores;
    }

    public String getAthleteNo() {
        return athlete.getAthleteNo();
    }

    public String getName() {
        return athlete.getName();
    }

    public double getFinalScore() {
        return scores.getFinalScore();
    }

    // 使用名字进行大小的比较，可以用来排序
    // 前面实现了 Comparable 接口，下面是需要实现方法的
    @Override
    public int compareTo(Match o) {
        return athlete.getName().compareTo(o.getName());
    }
}

