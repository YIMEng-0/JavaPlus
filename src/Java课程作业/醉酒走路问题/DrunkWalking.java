package Java课程作业.醉酒走路问题;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:41 上午
 */

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟醉汉行走问题：
 * 每走一步用随机方法生成步长和方向，每一步可用一个矢量表示，
 * 将这些矢量累加起来可以计算出醉汉最后走出的距离和方向。
 * 通过模拟实验，评估其走路的效率
 *
 */
public class DrunkWalking {
    //醉汉行走过程中的位置信息
    private List<LocationOfDrunk> drunkLocations = new ArrayList<>();
    //醉汉距离原点的距离
    private double distance = 0;

    /**
     * 模拟醉汉行走算法实现
     *  输入的参数为醉汉行走的步数(walkNum);
     *  行走的最大距离(maxStride)
     */
    public void drunkWalking(int walkNum, double maxStride) {
        drunkLocations.add(new LocationOfDrunk(0, 0));//原点
        LocationOfDrunk currentLocation = new LocationOfDrunk();//醉汉当前位置
        double stride = 0;//步长
        double direction = 0;//方向
        for (int i = 0; i < walkNum; i++) {
            System.out.print("前进了" + (i + 1) + "步；");

            // 当前的步长
            stride = getRandomNum(0, maxStride);

            // 当前人所处的方向
            // 参数进行传递，实现向着随机方向进行前进
            direction = getRandomNum(0, 360);
            currentLocation.setX(twoDecimalPlaces(currentLocation.getX() + stride * Math.cos(direction), 3));
            currentLocation.setY(twoDecimalPlaces(currentLocation.getY() + stride * Math.sin(direction), 3));

            // 计算两点之间的距离，使用两点之间的距离计算公式
            distance = twoDecimalPlaces(Math.sqrt(Math.pow(currentLocation.getX(), 2) + Math.pow(currentLocation.getY(), 2)), 4);
            drunkLocations.add(new LocationOfDrunk(currentLocation.getX(), currentLocation.getY()));
            System.out.println(" 距离原点距离:" + distance + "m");
        }
        // 计算行走的效率
        double effectiveness = twoDecimalPlaces(distance / walkNum * maxStride, 4);//行走效率
        System.out.println("行走效率：" + effectiveness * 100 + "%");
    }
    /**
     * 生成随机数，并且运行下来是保留两位小数的
     */
    public double getRandomNum(double min, double max) {
        return twoDecimalPlaces(Math.random() * (max - min) + min, 3);
    }

    // 小数点保留了两位小数
    public double twoDecimalPlaces(double d, int n) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(n);
        return Double.parseDouble(nf.format(d));
    }

    public List<LocationOfDrunk> getDrunkLocations() {
        return drunkLocations;
    }

    public void setDrunkLocations(List<LocationOfDrunk> drunkLocations) {
        this.drunkLocations = drunkLocations;
    }
}


