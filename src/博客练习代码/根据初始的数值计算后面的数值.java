package 博客练习代码;

import jdk.jfr.consumer.RecordedThread;

import javax.xml.stream.XMLOutputFactory;
import java.sql.Connection;

public class 根据初始的数值计算后面的数值 {
    public static void main(String[] args) {
        // 给定起始的两个点的坐标，这里假设为 1.1，1.1 ；2.2，2.2
        Coordinate coordinate1 = new Coordinate(1.1,1.1);
        Coordinate coordinate2 = new Coordinate(2.2,2.2);

        // 得到根据迭代算法获得的 横坐标以及纵左边的数据
        double[] rsX =  getX(coordinate1.x,coordinate2.x);
        double[] rsY =  getY(coordinate1.y,coordinate2.y);

        // 调用相关的画图代码，直接出图即可
    }

    // 更具前面的数据迭代得到新的 x数据

    /**
     * 在这个方法可以添加具体的生成规则，生成 x
     * @param x1
     * @param x2
     * @return
     */
    public static double[] getX(double x1, double x2) {


        return null;
    }

    /**
     * 在这个方法可以添加具体的生成规则，生成 y
     * @param y1
     * @param y2
     * @return
     */
    public static double[] getY(double y1,double y2) {

        return null;
    }
}

class Coordinate {
    double x;
    double y;

    public Coordinate() {

    }
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
