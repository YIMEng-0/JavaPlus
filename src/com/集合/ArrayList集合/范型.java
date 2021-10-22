package com.集合.ArrayList集合;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 4:06 下午
 */
public class 范型 {
    // 范型提供了编译时候，类型安全检测机制，允许在编译时检测到非法的数据类型；
    // 范型的本质是参数化类型，操作的数据类型指定为一个参数
    /*
        你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用

        定义泛型方法的规则：
            所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）；
            每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符；
            类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符；
            泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型（也就是基本数据类型的包装类），不能是原始类型（像int,double,char的等）；
     */

    // 定义范型的方法：
    public static <E> void printArray(E[] inputArray)
    {
        // 对于数组元素的输出
        for (E element:inputArray){
            System.out.println(element);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6};

        Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};

        Character[] charArray = {'A','B','C','D'};

        System.out.println("整型数组的元素为：");
        printArray(intArray);

        System.out.println("\n双精度型的数组元素为：");
        printArray(doubleArray);

        System.out.println("\n字符型数组元素为：");
        printArray(charArray);

        System.out.println("======");

        System.out.printf("%d,%d,%d 中最大的数字为：%d\n\n",3,4,5,maximum(3,4,5));

        System.out.printf("%.1f,%.1f,%.1f 中最大的数字是：%.1f\n\n",6.6,6.7,6.8,maximum(6.6,6.7,6.8));

        System.out.println("======");
    }
    // 有界的类型参数
    // 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界

    public static <T extends Comparable<T>>T maximum(T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }

        if (z.compareTo(max) > 0){
            max = z;
        }
        return z;
    }
}
