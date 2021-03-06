package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 4:06 下午
 */

/**
 * 编译时异常和运行时异常都是在运行时才会发生，但是处理的方式不一样，一个是预处理，一个是在程序运行的过程中通过异常抛出或者
 * try catch 从而处理的
 *
 * 异常有编译时异常和运行时异常：
 *      编译时的异常需要处理，否则运行不了，运行时异常可以处理，也可以选择不处理；
 *      编译阶段不处理，编译器会报错，程序无法向着下面执行；
 *      所有的异常都是在程序的运行过程中发生，因为只有在程序的运行阶段，才可以进行 new 对象
 *
 * 编译时异常和运行时异常的区别？
 *      编译时异常发生概率高；
 *      运行异常发生的概率低；
 *
 * 编译时异常的其他名字：
 *      受检异常 CheckedException
 *      受控异常
 *
 * 运行时异常的其他名字：
 *      未受检异常 UnCheckedException
 *      非受控异常
 *
 * 所有的异常都是发生在运行阶段，因为只有在运行的时候，才可以进行异常对象的创建
 *
 * 对于异常的处理方式：
 *      1、方法申明的位置上使用 throws 关键字，抛给上一级
 *          谁调用了这个方法，异常就抛给谁
 *
 *      2、使用 try catch 进行异常的捕捉
 *          这件事发生了，谁都不知道，自己捉住了
 *
 *   思考：
 *      异常发生，抛给了上一级的方法，调用者需要对这个异常进行下一步的继续处理，同样拥有两种处理的方式，见上面的 1 2
 */

/**
 * java 语言中的异常是以什么样子的形式存在的？
 *      1、异常在 Java 中是通过类的形式存在，每一个异常类都可以进行创建异常对象
 *      2、异常对应的生活中是什么样子的 ？
 *          ，，，着火了（异常对象）
 *          ，，，着火了（异常对象）
 *          ，，，着火了（异常对象）
 *
 *          类是模板，对象是世纪钟存在的个体
 *
 *          钱包丢了，就是一了异常类
 *              小明的钱包丢了，异常对象
 *              小红的钱包丢了，异常对象
 *
 *              注意类和对象之间的差距
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;  // 实际上在这里 Java 会进行异常对象的创建 new 异常对象
                        // 创建了对象之后 在main() 方法中调用了数据的计算，所以 在 main 中进行了异常的抛出，到大了 JVM 之后，
                        // 程序终止，程序退出
                        // Arithmatic 异常属于运行时异常，在编译阶段不需要处理，
        System.out.println(a + "a" + "/" + "b" + b + "=" + a / b);

        System.out.println(100 / 0); // 此处也会创建一个异常对象，底层会创一个对象


        // 通过 "异常类" "实例化" "异常对象"
        NumberFormatException nfe = new NumberFormatException("数字格式化发生异常");

        // java.lang.NumberFormatException: 数字格式化发生异常
        System.out.println(nfe);

        // 通过"异常类" 创建 "异常对象"
        NullPointerException npe = new NullPointerException("发生了空指针异常");
        System.out.println(npe);
    }
}
