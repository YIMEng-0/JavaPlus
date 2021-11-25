package Java课程作业.packanimal;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author Doraemon
 * @date 2021/11/24 6:55 下午
 * @version 1.0
 */
public class Line {
    // 设置线条的颜色
    private String color;

    // 设置线条的名字
    private String lineName = null;

    // 设置线条的斜率
    private double k;

    Point point;
    Point point1;
    Point point2;


    // 单独的设置线条的颜色
    public String setColor() {
        return color;
    }

    // 单独的设置线条的名字
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    // 将线条的主体创建出来，构成的基本要素是两个点，线条的名字以及线条的颜色
    public Line(String name, Point point1, Point point2, String color) {
        this.lineName = name;
        this.color = color;
        this.point1 = point1;
        this.point2 = point2;
    }


    public double getK(Point point2,Point point1) {
        // 将斜率创建出来
        return (point2.y - point1.y) / (point2.x - point1.x);
    }

    public double getLength() {
        // 定义线条的长度
        double lineLength;

        // 根据两个点之间的坐标直接进行计算即可，使用了勾股定理
        lineLength = Math.sqrt(((point2.y - point1.y) * (point2.y - point1.y) + (point2.x - point1.x) * (point2.x - point1.x)));

        return lineLength;
    }

    public Line(Point point, double length, double direction) {
        // 使用线的长度以及线的方向进行计算第二个点的直角坐标 x1,y1
        double x1 = point.x + length * Math.cos(direction);
        double y1 = point.y + length * Math.sin(direction);


        // 将计算好的直角坐标给一个点的数据结构赋值
        Point point3 = new Point(x1, y1);

        // 使用上面的线的构造方法创建出来有名字，有颜色的直线
        Line directionLine = new Line("directionLine", point, point3, "black");
    }
}