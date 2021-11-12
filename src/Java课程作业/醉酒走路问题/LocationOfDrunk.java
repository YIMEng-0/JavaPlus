package Java课程作业.醉酒走路问题;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:40 上午
 */

/**
 * 定义了位置的移动变量 x y 以及两者之间的组合（x,y）
 */
public class LocationOfDrunk {
    private double x;
    private double y;

    public LocationOfDrunk() {
    }

    public LocationOfDrunk(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
