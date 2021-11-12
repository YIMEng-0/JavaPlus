package Java课程作业.packanimal;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/12 3:12 下午
 */
public class AnimalTest {
    public static void main(String[] args) {
        // 创建动物的对象
        Animal animal = new Animal();

        // 使用一个构造参数的构造器进行动物对象的创建
        animal.setAnimalName("Panda");
        String animalName =  animal.getAnimalName();
        System.out.println("设置的动物的名字是：" + animalName);

        //使用三个参数的构造器进行动物对象的创建
        System.out.println("========");
        Animal animal1 = new Animal("Tiger","yellow - black","100kg");
        System.out.println(animal1 +  " 的颜色是: " + animal1.getColor());
        System.out.println(animal1 +  " 的名字是: " +animal1.getAnimalName());
        System.out.println(animal1 +  " 的重量是: " +animal1.getWeight());

        //使用两个参数的构造器进行动物对象的创建
        System.out.println("========");
        Animal animal2 = new Animal("斑马","黑白相间");
        System.out.println(animal2 +  " 的颜色是: " + animal1.getColor());
        System.out.println(animal2 +  " 的名字是: " +animal1.getAnimalName());
    }
}