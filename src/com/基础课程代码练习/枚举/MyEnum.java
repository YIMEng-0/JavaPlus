package com.基础课程代码练习.枚举;

/**
 * 枚举是一种数据类型
 *      1、枚举怎么定义？
 *      enum{
 *          值1，值2
 *      }
 *      2、只有两种运行结果的，建议使用布尔类型，结果存在多种结果，建议使用枚举类型进行处理
 *      3、比如：颜色，四季
 */

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 3:25 下午
 * <p>
 * 对下面的程序进行分析，判断其存在什么样的缺陷？
 * 编译，运行都是没有问题的，在设计上面存在什么问题？
 * 在程序的设计上面，返回的是 int 的类型，只有两种返回结果，
 * 可以考虑仅仅使用 boolean 数据类型，控制返回的结果
 * 所有的错误最好是在编译器的阶段就进行找出来，越早越好一些
 * <p>
 * 好的方法是返回 boolean 类型
 */

/**
 * 对下面的程序进行分析，判断其存在什么样的缺陷？
 * 编译，运行都是没有问题的，在设计上面存在什么问题？
 * 在程序的设计上面，返回的是 int 的类型，只有两种返回结果，
 * 可以考虑仅仅使用 boolean 数据类型，控制返回的结果
 * 所有的错误最好是在编译器的阶段就进行找出来，越早越好一些
 * <p>
 * 好的方法是返回 boolean 类型
 */

/**
 * 使用了枚举，将程序运行的结果进行了分流；
 */
public class MyEnum {
    public static void main(String[] args) {
        Result s = divide(10, 0);
        System.out.println(s == Result.SUCCESS ? "成功" : "失败");
    }

    /**
     * 计算两个数据的商
     *
     * @param a int 数据
     * @param b int 数据
     * @return 1 表示成功 0 表示失败
     */
    // 下面的方法中是没有枚举的概念的
    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }

    /**
     * 上面的设计中，只会返回成功和失败两种情况，在实际的开发过程当中，会出现，多种的返回结果；
     * 但是返回的结果是可以数清楚的，可以一个一个数清楚的，这个 布尔类型是无法满足需求的，此时需要 java 语言中的枚举类型；
     */
}

/**
 * 枚举，程序运行的结果是可以一个一个数清楚的
 *      枚举在编译之后也会变成 class 文件
 *      枚举是一种引用数据类型；
 *      枚举中的每一个值可以看作是一个常量；
 */


enum Result {
    SUCCESS, FAIL
}
