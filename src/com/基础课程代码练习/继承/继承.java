package com.基础课程代码练习.继承;
// 测试
// 关于Java 语言中的继承
/**
 *      1、 继承是面向对象的三大特征之一，封装 com.基础课程代码练习.继承 多台2
 *      2、继承的基本作用代码的重复使用，但是继承最重要的是：有了继承之后，才有了方法的'覆盖'以及'多态'机制
 *      3、继承的语法格式：
 *          【修饰符列表】 class 类名 extends 父类名{
 *              类体 = 属性 + 方法
 *          }
 *      4、Java语言中的继承只支持单继承，一个类不能同时继承很多类
 *      5、C++ 中支持多继承
 *              继承中简单专业术语：
 *                  A 类称之为：父类，基类，超类，（superclass）
 *                  B 类称之为：子类，派生类（subclass）
 *      6、在Java语言子类对于父类的继承，都在继承什么呢？
 *          * 私有的不支持继承
 *          * 构造方法不支持继承
 *          * 其他的数据支持继承
 *      7、虽然Java语言中只支持单继承，但是一个类可以在间接的情况下进行其他类的继承，比如：
 *          // 进行间接的继承
 *          C extends B{
 *
 *          }
 *          B extends A{
 *
 *          }
 *          A extends T{
 *
 *          }
 *
 *      8、假设Java语言中没有显示继承任何类，那么默认继承Java 库当中的 java.lang.Object类
 *         Java语言中的任何一个类都是具有object类的
 */
public class 继承 {
    public static void main(String[] args) {
        CreditAccount act = new CreditAccount();

        // 继承了公开的方法 ，进行了数值的访问 使用了 setter and getter 使用了公开的方法进行了间接的访问
        act.setActNo("act - 001");
        act.setBalance(-1000);
        act.setCredit(0.99);

        // 使用get 进行相关的调用
        System.out.println(act.getActNo() + " , " + act.getBalance() + " , " + act.getCredit() + ";");


    }
}
