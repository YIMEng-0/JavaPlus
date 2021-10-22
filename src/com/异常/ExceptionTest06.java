package com.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/22 7:47 下午
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 处理异常的第一种方式：在方法的申明上面，使用 throws 进行抛出，谁调用了方法，就将这个异常抛给谁，调用者进行处理；
 *
 * 方法体当中的额代码出现异常之后，如果上报的话，这个方法的执行就会结束；
 * 此时的异常就和 return 的执行效果是一样的；
 */

/**
 * 异常没有被捕捉的时候，采用了上报的形式，此方法后面的代码是不会执行的，
 * try 语句块中的某一行代码出现了异常时，该行后面的代码不会被执行；
 * try catch 在捕捉之后，后面的代码是可以执行的
 */

/**
 * 综上：
 *      遇到异常的解决方式：
 *         1、上报进行解决
 *         2、自己捕捉进行解决
 */

/**
 * 编译时异常不进行处理，根本没有办法运行，必须处理；
 * 运行时异常在程序的运行过程当中才会进行处理 new 出来一个异常对象；
 * try catch 只要已经在一个位置进行了捕捉处理之后，就不会继续向着上面进行抛了，因为相关的问题已经得到了解决；
 */

/**
 * try 在 catch 中捉住了异常之后，后面的
 */
public class ExceptionTest06 {
    /**
     * 一般的 main() 方法中，不推荐继续向着 上面进行抛出异常，在这里，一般情况下直接捕捉到，进行处理即可；
     * 进行异常的原因就是增强了程序的健壮性，发什么异常 catch 之后，进行处理，就不会影响程序的继续运行；
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Main begin");
        m1();
        System.out.println("Main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    // 如果在方法的上面的抛出 FileNotFound 的父类的异常是可以的，抛其他的类的异常就不能解决问题
    // throws 后面可以加上去多个异常，中间使用多个逗号隔离开即可
    private static void m2() {
        System.out.println("m2 begin");

        // 此处不进行异常处理的话，编译器仍然会报错


        /**
         * 程序运行到这里之后，要么捕捉，要么进行上抛，在这里进行了拦截，catch 了一下
         *
         * 抛出的异常是，根据上面抛的异常决定的，不是随便乱抛的
         */
        try {
            m3();
        } catch (FileNotFoundException e) { // 分支中保存的 e 引用，是 new 出来的异常对象的地址，
            e.printStackTrace();            // catch 是捕捉异常之后的分支
        }

        // catch 处理完了异常之后，代码在这里会继续执行
        System.out.println("文件不存在可能是文件路径名字是错误的");
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        /**
         * 使用文件输入流对象进行代码的测试
         *
         * 编译报错的原因？
         *      1、调用了构造方法：FileInputStream(String name)
         *      2、构造方法的声明位置上有 throws FileNotFoundException 的异常机制，调用了需要对这个进行处理
         *      3、通过类的继承结果FileNotFoundException 的父类是IOException IOException 的父类是 Exception
         *         最终知道FileNotFound 是编译时异常，要求程序员阶段需要对这个进行处理
         */

        /**
         *  对于异常处理的机制：
         *      1、在方法声明的位置上继续上抛，
         */

        System.out.println("m3 begin");
        new FileInputStream("\\Users\\yimeng\\Desktop\\test.txt");

        // m3() 在这里出现了异常之后，下面的语句是不会执、
        System.out.println("m3 over");
    }
}