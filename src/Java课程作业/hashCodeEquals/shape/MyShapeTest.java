package Java课程作业.hashCodeEquals.shape;

/**
 * @author Doraemon
 * @date 2021/12/3 10:24 上午
 * @version 1.0
 */
public class MyShapeTest {
    public static void main(String[] args) {
        double x1 = 0, x2 = 3, x3 = 3, y1 = 0, y2 = 0, y3 = 4;
        Shape triangle = new Triangle(x1, y1, x2, y2, x3, y3);

        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();
        System.out.println("三角形的面积为：" + area);
        System.out.println("三角形的周长为：" + perimeter);
    }
}
