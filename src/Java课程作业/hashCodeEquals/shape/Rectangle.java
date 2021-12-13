package Java课程作业.hashCodeEquals.shape;

/**
 * @author Doraemon
 * @date 2021/12/3 10:09 上午
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 创建一个类的时候，可以进行继承一个抽象类，可以实现相关的接口，在抽象类以及接口中，判断是不是进行抽象方法的实现：
 *      如果创建出来的类不是抽象类的话，需要对所有的抽象方法进行实现，否则在创建出来的新类的上面应该注明，这是一个抽象类；
 *      当自己在创建出来的新类上面表明了是一个抽象类，那么对于部分的抽象方法是不需要实现的；
 */
public class Rectangle extends Shape {
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    // 四个坐标的横坐标与纵坐标分别组成的数组
    private double[] yArr = {point1.y, point2.y, point3.y, point4.y};
    private double[] xArr = {point1.x, point2.x, point3.x, point4.x};

    // 找到长度最大的纵坐标
    private double maxY = max(yArr);
    // 找到长度最小的纵坐标
    private double minY = min(yArr);
    // 找到长度最大的横坐标
    private double maxX = max(yArr);
    // 找到长度最小的横坐标
    private double minX = min(xArr);

    // 创建出来矩形的
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    // 计算矩形的周长
    // 坐标的最大值最小值需要找出来
    @Override
    public double getPerimeter() {
        return 2 * ((maxX - minX) + (maxY - minY));
    }

    // 计算矩形的面积
    // 四个点坐标的最大值，最小值需要找出来
    @Override
    public double getArea() {
        // 四个坐标的横坐标与纵坐标分别组成的数组
        double[] yArr = {point1.y, point2.y, point3.y, point4.y};
        double[] xArr = {point1.x, point2.x, point3.x, point4.x};

        // 找到长度最大的纵坐标
        double maxY = max(yArr);
        // 找到长度最小的纵坐标
        double minY = min(yArr);
        // 找到长度最大的横坐标
        double maxX = max(yArr);
        // 找到长度最小的横坐标
        double minX = min(xArr);

        // 计算矩形的面积
        double area = (maxX - minY) * (maxX - minX);
        return area;
    }

    // 进行矩形的移动
    // 所有的坐标都进行移动即可
    @Override
    public void move(int x, int y) {
        point1.x += x;
        point1.y += y;
        point2.x += x;
        point2.y += y;
        point3.x += x;
        point3.y += y;
        point4.x += x;
        point4.y += y;
    }

    // 对于 equals() 方法 hashCode() 方法的重写
    // 在这里比较的逻辑是一个矩形的四个点的坐标都是相等的时候，两个矩形完全是一致的
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(point1, rectangle.point1) && Objects.equals(point2, rectangle.point2) && Objects.equals(point3, rectangle.point3) && Objects.equals(point4, rectangle.point4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2, point3, point4);

    }

    // 进行 toString 方法的重写
    @Override
    public String toString() {
        return "Rectangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }

    // 寻找数组中的最大值
    public static double max(double[] array) {
        double max = 0;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 寻找数组中的最小值
    public static double min(double[] array) {
        double min = 0;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}