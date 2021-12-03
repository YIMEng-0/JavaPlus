package Java课程作业.hashCodeEquals.shape;

/**
 * @author Doraemon
 * @date 2021/12/3 10:09 上午
 * @version 1.0
 */

/**
 * 创建一个类的时候，可以进行继承一个抽象类，可以实现相关的接口，在抽象类以及接口中，判断是不是进行抽象方法的实现：
 *      如果创建出来的类不是抽象类的话，需要对所有的抽象方法进行实现，否则在创建出来的新类的上面应该注明，这是一个抽象类；
 *      当自己在创建出来的新类上面表明了是一个抽象类，那么对于部分的抽象方法是不需要实现的；
 */
public class Rectangle extends Shape{
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void move(int x, int y) {

    }
}