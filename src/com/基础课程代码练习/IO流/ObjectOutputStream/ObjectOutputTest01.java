package com.基础课程代码练习.IO流.ObjectOutputStream;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/7 11:35 上午
 */

//import java.io.Serial;
import java.io.Serializable;

/**
 * 对象的序列化以及反序列化
 *  内存中的对象放在了硬盘中的文件中叫做序列化；
 *      内存中的对象切片，传输
 *
 * 序列化：拆分对象
 * 反序列化：合成对象
 *      序列化：Serialize       java 对象的状态保存下来的过程 ObjectOutputStream
 *      反序列化：DeSerialize    将硬盘上的数据恢复成为 java 对象  ObjectInputStream
 *
 * transient 表示当前的对象是不参与序列化的，是一种游离的状态；不参与序列化操作
 * 序列化的作用，硬盘和内存之间的数据交互，购物车记录的加载；
 *
 * 序列化版本号的作用：
 *  对于书写的类的区别：；两个人写了同样的类 使用 Serializable 关键字，JVM 可以对这两个类进行识别，不是同一个东西
 *
 *      自动生成序列化版本类的缺陷？
 *          不能修改代码，改了之后，就是不是一个类的，从业务的开发逻辑上面来讲，应该是同一个类；
 *          重新编写，会进行编译， JVM 会认为两个是不同的类 （这样子不好）
 *
 * 最终结论：一个类实现了 Serializable ，建议将自动化序列号固定不变；以后类的代码修改了， JVM 认为是同一个类
 *         建议将序列号写好不要重复
 */
public class ObjectOutputTest01 implements Serializable {
    // 自动生成自动化序列号
//    @Serial
    private static final long serialVersionUID = -1695050463123712840L;
    private static transient int a =10; // 表示这个变量是不会被序列化的；不被拆分成为序列，放到硬盘当中

    // JVM 先使用 类名识别 类，类名字重复，使用 序列化版本号识类
    public static void main(String[] args) {

    }
}