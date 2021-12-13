package Java课程作业.hashCodeEquals.shape;

import java.awt.*;
import java.util.Objects;

/**
 * @author Doraemon
 * @date 2021/12/3 10:07 上午
 * @version 1.0
 */
public class Triangle extends Shape {
    // 三角形的点的创建，进行下面的创建相关的计算周长以及面积
    Point point1;
    Point point2;
    Point point3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
    }

    // 获取三角形的周长
    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = getLength(point1, point2) + getLength(point2, point3) + getLength(point3, point1);
        return perimeter;
    }

    // 获取三角形的面积
    // 通过海伦凯勒公式，通过三边的长度进行三角形面积的计算
    @Override
    public double getArea() {
        //三边长度
        double a = getLength(point1, point2);
        double b = getLength(point2, point3);
        double c = getLength(point3, point1);
        double s;//面积
        s = (float) ((1.0 / 4.0) * Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)));

        return s;
    }

    // 进行三角形的移动，将所有点的横坐标以及纵坐标进行相关的移动即可
    @Override
    public void move(int x, int y) {
        point1.x += x;
        point1.y += y;
        point2.x += x;
        point2.y += y;
        point3.x += x;
        point3.y += y;
    }

    // 对于 equals() 以及 hashCode() 方法的重写


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return Objects.equals(point1, triangle.point1) && Objects.equals(point2, triangle.point2) && Objects.equals(point3, triangle.point3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2, point3);
    }

    public static double getLength(Point point1, Point point2) {
        // 使用勾股定理把两点之间的距离计算出来
        return Math.sqrt(((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y)));
    }
}
