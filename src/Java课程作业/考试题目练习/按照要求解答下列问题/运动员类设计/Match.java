package Java课程作业.考试题目练习.按照要求解答下列问题.运动员类设计;

/**
 * @author Doraemon
 * @date 2021/12/18 9:59 下午
 * @version 1.0
 */
public class Match {
    private Athlete athlete;
    private Scores scores;

    public Match(Athlete athlete, Scores scores) {
        this.athlete = athlete;
        this.scores = scores;
    }

    // 接收相关参数，接收不确定的参数输入 double... a
    // 接收名字，运动员编号，运动员的分数，用来创建出来一个比赛
    public Match(String lin_ma, String s, double... a) {
        this.athlete = new Athlete(lin_ma,s);
        this.scores = new Scores(a);
    }

    public boolean getAthleteNo() {
        return false;
    }

    public Object getName() {
        return false;
    }

    public Object getFinalScore() {
        return false;
    }
}
