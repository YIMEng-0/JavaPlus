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

    // 三个参数的额构造器
    public Animal(String animalName, String color, String weight) {
        this.animalName = animalName;
        this.color = color;
        this.weight = weight;
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
