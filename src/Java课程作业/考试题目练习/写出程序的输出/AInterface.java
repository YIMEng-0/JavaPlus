package Java课程作业.考试题目练习.写出程序的输出;

import javax.xml.transform.sax.SAXSource;

/**
 * @author Doraemon
 * @date 2021/12/18 8:43 下午
 * @version 1.0
 */

// 关于作用域的使用范围;
// 同类 同包 子类 不同的包

/**
 *  Java 在接口Interface中 使用关键字 default
 *  https://blog.csdn.net/qq_35387940/article/details/104767746
 */
public interface AInterface {
    // 当你很多个impl都去实现 这个接口， 而每个impl都是要包含同一个方法的时候，那么你可以直接在接口里面实现这个方法，
    // 并使用default修饰。
    default int funA(int i) {
        return i * 10;
    }
}

abstract class AClass {
    public abstract int funA(int i);
}

class Leaf extends AClass implements AInterface {
    // 既然自己已经实现了，就使用自己定义好的就行
    @Override
    public int funA(int i) {
        return i * 100;
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();

        // 这里使用的是 Leaf 里面的funA() 方法，
        System.out.println(leaf.funA(5)); // 500
    }
}
