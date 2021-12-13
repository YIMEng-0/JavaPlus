package Java课程作业.packanimal;

import Java课程作业.hashCodeEquals.shape.Point;

/**
 * @author Doraemon
 * @date 2021/11/24 7:16 下午
 * @version 1.0
 */
public class LineTest {
    public static void main(String[] args) {
        // 创建出来两个点用来构造线条
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(3.0, 4.0);

        // 进行线条的创建
        Line line = new Line("myFirstLise", point1, point2, "black");

        // 得到计算的线条的斜率
        double lineK = line.getK(point2, point1);
        System.out.println("线条的斜率为 ： " + lineK);

        // 得到线条的长度
        double lineLength = line.getLength();
        System.out.println("线条的长度为：" + lineLength);

        Line directionLine = new Line(point1, 10.0, 30);
        System.out.println(directionLine.getK(point2, point1));
    }
}
