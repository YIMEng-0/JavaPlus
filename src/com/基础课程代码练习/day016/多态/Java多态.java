package com.基础课程代码练习.day016.多态;

/**
 *  关于Java 语言中的多态语法机制：
 *      下面仅仅为基本的语法机制：
 *      1、Animal Cat Bird
 *          Cat 继承了 Animal
 *          Bird 继承了 Animal
 *          Cat 和 Bird 没有任何关系
 *
 *      2、面向对象的三大特征：封装 com.基础课程代码练习.继承 多态
 *
 *      3、关于多态中的几个概念
 *          向上转型（upCasting）（自动类型转换）（子到父）
 *          向下转型（downCasting）（强制类型转换）（父到子）（添加强制类型转换符号）
 *      4、不论是向上转型还是向下转型，两种类型之间必须具有继承关系，否则程序无法编译通过
 */

public class Java多态 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.move();

        Cat cat = new Cat();
        cat.move();

        Bird bird = new Bird();
        bird.move();

        // 使用多态的语法机制
        // 下面这句话的翻译为：猫是一个动物
        // Cat is a Animal
        /**
         *   1、Animal 与 Cat 之间存在关系，Animal 是父类，Cat 是子类；
         *   2、new Cat（）创建的对象是Cat ，animal1 引用的数据类型是Animal ，两者之间进行了类型转换；
         *   3、子类转换成为了父类，叫做向上转型 / upCasting，叫做自动的类型转换；
         *   4、Java中允许这种语法，父类型引用指向子类行对象；
         */

        // is a
        Animal animal1 = new Cat();


        /**
         *
         *  1、Java程序永远分为编译阶段以及运行阶段
         *  2、先分析编译阶段，在分析运行阶段，编译无法通过是无法运行的
         *  3、编译阶段的编译器检查 animal1 是 Animal 的数据类型，所以让其通过，由于Animal.class 字节码中有 move（）的方法，所以所以编译
         *      可以通过，此阶段叫做静态绑定，编译阶段绑定；
         *      只有静态的绑定之后，才能进行后续的运行；
         *  4、在程序运行的时候，JVM中的堆内存中的对象是Cat 对象，那么以下的程序在运行阶段一定会调用Cat（）对象的move（）方法，此时发生了动态绑定，运行阶段绑定
         *     如果将 Cat 中的 move（）方法进行注释，此时会调用 Animal 中的move（）方法；
         *
         *  5、无论Cat 类中有无重写move（）方法，运行阶段一定调用的是 Cat对象 的move（）方法，因为底层的真实对象是 Cat 对象
         *  6、父类型引用指向子类型对象这种机制，导致程序运行时存在编译阶段以及运行阶段存在不同的状态，这种机制可以叫做多态语法机制
         *
         */
        animal1.move();
        // animal1 在编译器中只认是Animal 类型，这是处于编译期间，这里访问的只是Animal类 中有的东西  编译期
        // 在运行的时候，关注底层的对象是一只猫，此时的方法调用的结果是 Cat 里面的东西，运行的结果是Cat is moving
        // 编译的时候指的是父类中的方法，运行的时候的是具体的创建出来的对象；编译和运行两个阶段是不同的


        // animal1.catchMouse();
        /**
         * animal1 为什么不可以直接调用catchMouse 方法？
         *      因为在编译的时候，编译器识别到的是Animal 类型，并不是Cat类型；
         *      编译器在 Animal.class 字节码文件中找不到 catchMouse 这个方法，所以会报错；
         *      没有绑定成功，无法运行，编译通过才能运行；
         *      此时将 Animal 类型进行强制的转换 ，进行方法的调用；
         *      进行类型的转换；
         *      想要进行类型转换，都需要继承关系；
         *      当两者不存在继承关系的时候，编译器就会报错，
         *        比如：
         *            Bird b1 = new Cat();
         */

        // 此时想要让 Animal 出来的引用进行引用 Cat的对象里面的方法， 进行一定的处理
        // 进行类型的强制转换 ， 向向转型 / downCasting / 强制类型转换
        // 需要加上强制类型转换符号
        // 当调用的方法是子类型中特有的时候，必须进行向下转型

        // 进行了强制的转换，使得可以访问子类型中的方法
        Cat cat1 = (Cat)animal1;
        // 将动物进行了强制的转换之后，可以进行调用子类中的方法
        cat1.catchMouse();


        // 父类型的引用指向子类型
        // 下面这句话在编译中会通过，但是在运行中会报错，出现不能出现的类型转换，因为两者之间不存在继承关系，不能进行强制类型转换 Cat 不是
        // 编译没有报错是因为：animal3 的类型是 Animal， Animal 与 Cat 之间存在继承关系，，并且 Animal 是父类型 ，Cat 是子类型
        // 父类型转换成为子类叫做向下转型语法是合格的
        // 程序虽然编译通过了，但是在运行的时候，会进行报错，因为JVM真实存在的对象叫做 Bird ，Bird 类型无法转换为Cat 对象，因为他们之间没有继承关系，
        // 此时出现了异常 ： java.lang.ClassCastException 类型转换异常
        Animal animal3 = new Bird();
        // 上面的一行代码 表面上是 Animal 底层上是 Bird
        // 想要类型转换，必须进行强制类型转换
        // 下面的错误 只会出现在强制类型转换的时候
        /**
         * 1、向上转型编译只要通过，运行一定可以
         * 2、向下转型编译通过，运行不会出现问题
         * 3、编译以及运行是两个不同的阶段以及状态
         * 4、Animal a3 = new Bird(); Cat c3 = (Cat)a3; (没有继承 不存在强制类型转换)  底层的Bird 无法转换成为 Cat 类型
         *
         * 5、避免向下转型出现的ClassCaseException?
         *      使用 instanceof 运算符 ；防止错误的出现导致从程序的运行的崩溃
         *      5.1 语法格式：
         *          （引用 instanceof 数据类型名）
         *      5.2 以上运算符执行的结果的数据类型是：bool（true or false）
         *      5.3 关于其运算的结果：true false
         *          假设（a instanceof Animal）
         *          true 表示：a 这个引用指向的对象是一个Animal 类型
         *          false 表示 a 的引用的对象不是 Animal 的数据类型
         *
         *  6、Java 中要求，进行强制的类型转换的时候，需要进行 instanceof 的类型的判断 强制类型的转换之前 Good Habits
         */

        // Cat c3  = (Cat)animal3; // 运行时会报错，类型转换异常
        // 底层的东西是 Bird 但是表面上的引用指的是Cat 所以运行的时候会进行报错

        /**
         * 多态的简单例子理解：
         *  比如有动物（Animal）之类别（Class），而且由动物继承出类别鸡（Chicken）和类别狗（Dog），并对同一源自类别动物（父类）之一消息
         *  有不同的响应，如类别动物有“叫()”之动作，而类别鸡会“啼叫()”，类别狗则会“吠叫()”，则称之为多态。
         */



        // 进行数据类型的转换 否则 定义的变量只是 Animal 中的东西 是没有办法使用 相关的方法的
        // 一个猫不能转换成为一个鸟
        // 进行 instance的判断 猫之间可以相互进行转，鸟之间可以进行转换
        // 进行一定的判断，将会变得更加的安全
        if(animal3 instanceof Cat){
            Cat cat3 = (Cat) animal3;
            cat3.catchMouse();
        }
        else if(animal3 instanceof Bird){
            Bird bird3 = (Bird) animal3;
            bird.fly();
        }
    }
}
