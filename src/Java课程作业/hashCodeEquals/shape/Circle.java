package Java课程作业.hashCodeEquals.shape;

import java.awt.Point;

public class Circle extends Shape {
    private Point center;    // 圆心
    private double radius; // 半径
    private double perimeter; // 周长
    private double area;    // 面积

    public Circle() {
        center = new Point(0, 0);
        radius = 0.0;
        perimeter = 0.0;
        area = 0.0;
    }

    // 有参数的构造方法，
    public Circle(String c, int x, int y, double r) {
        super(c); // 颜色的传递
        center = new Point(x, y); // 点的创造
        radius = r;     // 半径的传递
        calArea();         //调用本类的私有方法，计算图形的面积
        calPerimeter();
    }

    private void calArea() { //私有方法，计算图形的面积
        area = Math.PI * radius * radius;
    }

    private void calPerimeter() { // 私有方法，计算图形的周长
        perimeter = Math.PI * radius * 2.0;
    }

    @Override
    public void move(int x, int y) {
        center.x += x;
        center.y += y;
//		center.move(center.x+x, center.y+y);  相同功能的方法
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

}
