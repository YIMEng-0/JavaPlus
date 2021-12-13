package Java课程作业.hashCodeEquals.dog;

public class DogTest {
    public static void main(String[] agrs) throws ClassNotFoundException {
        Dog myDog = new Dog("阿黄", "黄色", 3);
        myDog.show();
        myDog.run();

        LargeDog myDog1 = new LargeDog(30);
        myDog1.show();
        myDog1.run();
        LargeDog myDog2 = new LargeDog("大藏", "黑灰色", 8, 60);
        myDog2.show();
        myDog2.run();
        System.out.println("getWeight重量是" + myDog2.getWight());
        Dog myDog3 = new LargeDog("红藏", "咖啡色", 4, 80);
        myDog3.show();
        myDog3.run();
        Dog.info();
        LargeDog.info();
        // myDog3.getWight();
        if (myDog3 instanceof LargeDog) {
            LargeDog sd = (LargeDog) myDog3;
            System.out.println("getWeight重量是" + sd.getWight());
        }
        System.out.println(myDog3.getClass());
        System.out.println(Dog.class);


        // 进行 equals hashCode 的测试
        boolean isEqual1 = myDog.equals(myDog2);
        boolean isEqual2 = myDog.equals(myDog3);
        boolean isEqual3 = myDog2.equals(myDog1);
        boolean isEqual4 = myDog2.equals(myDog3);

        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(isEqual3);
        System.out.println(isEqual4);

        // 进行 hashCode 的测试
        int myDogHashCode = myDog.hashCode();
        System.out.println(myDogHashCode);
    }
}
