package Java课程作业.packanimal;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/12 3:06 下午
 */
public class Animal {
    // 动物名字
    private String animalName;

    // 动物颜色
    private String color;

    // 动物体重
    private String weight;

    // 创建对象的个数
    private static int objNum;

    // 无参数构造器
    public Animal() {

    }

    // 一个参数的构造器
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    // 两个参数的构造器
    public Animal(String animalName, String color) {
        this.animalName = animalName;
        this.color = color;
    }

    // 三个参数的构造器
    public Animal(String animalName, String color, String weight) {
        this.animalName = animalName;
        this.color = color;
        this.weight = weight;
    }

    public static Animal getAnimalWeightInstance(String weight) {
        // 使用了静态工厂方法，创建出来了一个只有体重的动物实例，在构造调用的时候，更加方便，不需要知道在什么位置填写什么样子的参数
        // 直接使用相关的名字进行对象的创建，因为是静态的方法，可以使用
        // 静态工厂在有很多个属性进行构造的类中是有显著的优势的
        // 可以让使用类的人方便一些
        Animal animal = new Animal();
        animal.weight = weight;
        return animal;
    }

    // 获取动物的名字
    public String getAnimalName() {
        return animalName;
    }

    // 设置动物的名字
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    // 获取动物的颜色
    public String getColor() {
        return color;
    }

    // 设置动物的颜色
    public void setColor(String color) {
        this.color = color;
    }

    // 获取的动物的体重
    public String getWeight() {
        return weight;
    }

    // 设置动物的体重
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
