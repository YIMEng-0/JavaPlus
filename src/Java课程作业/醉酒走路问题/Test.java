package Java课程作业.醉酒走路问题;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:39 上午
 */
public class Test {
    public static void main(String[] args) {
        // 行走的步数
        int walkNum = 100;

        // 行走的最大距离
        double maxStride = 1;

        // 创建喝醉酒人的对象，让其进行走路
        DrunkWalking drunkWalking = new DrunkWalking();
        drunkWalking.drunkWalking(walkNum, maxStride);
    }
}


