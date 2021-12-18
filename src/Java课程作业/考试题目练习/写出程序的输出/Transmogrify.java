package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 8:04 下午
 * @version 1.0
 */

/**
 * 关于变量的作用于的文章：
 *  https://blog.csdn.net/qq_43555323/article/details/84987321
 */

class Actor {
    public void act() {
        System.out.println("sdscsd");
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void performPlay() {
        actor.act();
    }

    public void change() {
        // 外面定义的变量，在这个时候，被覆盖掉了，换成了新的对象，调用了新的对象的方法
        // 注意在程序中的变量，在方法体的外部定义的变量在下面程序执行的过程中，它的初始值是会一直的发生变化的，会更新；
        actor = new SadActor();
    }
}

public class Transmogrify {
    static int a = 10;
    public static void main(String[] args) {
        Stage stage = new Stage();


        stage.performPlay();  // HappyActor
        stage.change();
        System.out.println("==");
        stage.performPlay();  // SadActor
    }
}