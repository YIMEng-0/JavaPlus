package Java课程作业.考试题目练习.知识点练习.枚举数据类型;

/**
 * @author Doraemon
 * @date 2021/12/29 9:54 下午
 * @version 1.0
 */
public class TestDirections {
    public static void main(String[] args) {
        Directions directions = Directions.East;
        switch (directions){
            case East:
                System.out.println("East");
                break;
        }
    }
}