package com.static使用;

/**
 * 方法什么时候可以申明成为静态的？
 * 方法描述的是动作，当所有的对象执行动作的时候，最终执行的结果是一样的，那么这个动作已经不属于一个对象的动作了
 * 可以讲此动作进行提升档次，作为模板级别的动作
 * <p>
 * 对象的所有的动作都需要对象进行执行
 * 不需要动作的参数，可以直接进行使用
 * <p>
 * 静态方法无法直接访问实例变量以及实例方法
 * <p>
 * 实例的方法 由于静态的关系 使得方法上升一个模板 ，此时 将其定义成为一个静态的方法 使得内存空间进行一定的释放
 */

public class StaticFunction {

    int i = 100; // 实例变量

    // 这是实例方法
    public void doSome() {

    }

    ; // 实例方法

    // 静态方法
    public static void main(String[] args) {

        // 不能直接调用实例变量
        // doSome();
        // 在静态的方法中不能使用this 所以不能进行访问
        // System.out.println(i); 此处不能进行调用 因为不能调用实例变量1

        // 实例对象的访问必须使用对象进行调用 进行调用 进行调用 进行调用

        StaticFunction st = new StaticFunction();
        System.out.println(st.i);
        st.doSome();
        sumTheNum(1, 8);
    }

    public static int sumTheNum(int num1, int num2) {
        int c = num1 + num2;
        return c;
    }
}
/**
 * class 类明 {
 * 静态代码块； static
 * 实例代码块； {} 进行使用
 * <p>
 * 静态变量；
 * 实例变量；
 * <p>
 * 构造方法；// 创建对象的
 * <p>
 * 静态方法；// 类名点进行调用
 * 实例方法；// 引用点进行调用
 * }
 * <p>
 * this 指向当前的对象
 * static 表示定义的方法或者变量是属于静态的
 */