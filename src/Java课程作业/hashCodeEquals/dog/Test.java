package Java课程作业.hashCodeEquals.dog;

/**
 * @author Doraemon
 * @date 2021/12/2 6:46 下午
 * @version 1.0
 */
class Grandparent {
    public Grandparent() {
        System.out.println("GrandParent Created.");
    }
    public Grandparent(String string) {
        System.out.println("GrandParent Created.String:" + string);
    }
}
class Parent extends Grandparent {
    public Parent() {
        super("Hello.Grandparent.");
        System.out.println("Parent Created");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Child Created");
    }
}
public class Test{
    public static void main(String args[]) {
        Child c = new Child();
    }
}