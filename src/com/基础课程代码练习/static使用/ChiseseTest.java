package com.基础课程代码练习.static使用;
/*
    进行访问静态数据的时候，可以使用类名点，引用点，但是推荐使用类名点的方式，更加的安全
    使用引用点的时候，出现错误可能不报错
 */

/*
    static 关键字的理解
        1、static 英语单词为静态，是静态的方法，静态变量
        2、static 修饰的元素是静态的，可以使用类名点的方式访问
        3、使用类名点的方式进行访问

 */
public class ChiseseTest {
    public static void main(String[] args) {
        // 创建中国人对象1
        // 构造函数 进行对象的构造 在对象创建的时候进行调用构造
        // 名字是引用变量 进行对象的地址的存储
        Chinese Jack = new Chinese("1", "Jack", "中国");
        // 该使用类进行调用的时候，就是用类调用即可·
        System.out.println(Jack.id + " , " + Jack.name + " , " + Chinese.country);

        // 创建中国人对象1
        Chinese Tom = new Chinese("2", "Tom", "中国");
        System.out.println(Tom.id + " , " + Tom.name + " , " + Chinese.country);
    }
}