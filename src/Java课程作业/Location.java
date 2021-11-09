package Java课程作业;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:40 上午
 */
/** 位置类*/
public class Location {
    private double x;
    private double y;
    public Location(){}
    public Location(double x,double y){
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
