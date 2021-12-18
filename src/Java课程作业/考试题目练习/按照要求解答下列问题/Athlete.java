package Java课程作业.考试题目练习.按照要求解答下列问题;

import sun.management.counter.perf.PerfInstrumentation;

/**
 * @author Doraemon
 * @date 2021/12/18 9:40 下午
 * @version 1.0
 */
public class Athlete {
    private String Name;
    private String athleteNo;

    public Athlete() {

    }

    public String getName() {
        return Name;
    }

    public String getAthleteNo() {
        return athleteNo;
    }

    public Athlete(String name, String athleteNo) {
        Name = name;
        this.athleteNo = athleteNo;
    }
}
