package Java课程作业.packanimal;


/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/12 3:36 下午
 */
public class Point {
    // 平面直角坐标系
    private double x;
    private double y;

    // 极坐标的角度和长度
    private static double length;
    private static double theta;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 根据传进来设置的直角坐标转换成为直角坐标系的坐标
    public void calculatePolarCoordinates(double x, double y) {
        // 简单的勾股定理的计算
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("计算出来的极坐标的长度是：" + length);
        theta = Math.atan(y / x) * (180 / Math.PI);
        System.out.println("计算出来的极坐标的角度是：" + theta);
    }
}