package Java课程作业.考试题目练习.按照要求解答下列问题.参考答案的运动员类的设计;

/**
 * @author Doraemon
 * @date 2021/12/22 8:56 下午
 * @version 1.0
 */
public class Athlete {
    private String name;
    private String athleteNo;

    public Athlete() {
    }

    public Athlete(String name, String athleteNo) {
        this.name = name;
        this.athleteNo = athleteNo;
    }

    public String getName() {
        return name;
    }

    public String getAthleteNo() {
        return athleteNo;
    }
}

