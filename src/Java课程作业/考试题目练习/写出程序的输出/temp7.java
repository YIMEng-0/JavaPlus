package Java课程作业.考试题目练习.写出程序的输出;

/**
 * @author Doraemon
 * @date 2021/12/18 7:40 下午
 * @version 1.0
 */

/**
 * 检查了对于引用的理解；
 *
 * 一个引用指向了一块堆内存，Java 在进行方法调用的时候，使用的是值传递，将对象的地址,进行传递给另外一个引用变量，变得是局部的引用变量
 * 自己本身是不会变化的；
 *
 * https://juejin.cn/post/6844903696996941832 值传递以及引用传递的相关代码演示
 *
 *
 * 值传递，会在底层进行值的拷贝进行传递
 * 引用传递，看这个引用有没有指向原始的内存，指向原始的内存，可以改变原始的内存里面的东西；
 * 引用传递，传递过去的引用没有指向原始的内存，新开辟了一定的空间，那么对于原始的内容就是改变不了的
 */
public class temp7 {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        DataTest da = new DataTest(a);
        DataTest db = new DataTest(b);

        // 交换的是 dc1 以及 dc2 的数值，原来的 da db,的引用是没有发生变化的
        // 因为是值传递，对于原来的数值是没有改变的
        swap(da, db);
        System.out.println("da " + da);
        System.out.println("db " + db);
        da.show();  // 100
        db.show();  // 50

        DataTest dc = db;
        fun(dc, 5); // 250 相当于 db * 5; 这个传递进去是 db,dc 都指向了一块内存，所以 dc 的改变会改变 db 的数值

        db.show(); // 250
    }

    public static void fun(DataTest datat, int ix) {
        datat.change(ix);
    }

    public static void swap(DataTest dc1, DataTest dc2) {
        DataTest temp = dc1;
        dc1 = dc2;
        dc2 = temp;

        System.out.println("dc1" + dc1);
        System.out.println("dc2" + dc2);
    }
}

class DataTest {
    private int value;

    public DataTest(int value) {
        this.value = value;
    }

    public void show() {
        System.out.println("value = " + value);
    }

    public void change(int x) {
        value *= x;
    }
}