package com.day09;
/**
 *  用户测试类
 *
 *  对于当前的类中 ，类中的属性可以进行随意的访问 这里不安全的，
 *  一个用户的年龄不可能为 负数 当前程序存在的缺陷
 *
 *  面向对象 封装 com.继承 多台
 *
 *  这里讲解封装机制 为什么需要进行 封装的处理？
 *      封装的好处：
 *          1、封装之后，只能看到事物简单的那一面
 *          2、对外提供简单的操作入口 照相机的实现原理比较复杂，使用者操作起来是非常简单便捷的
 *          3、电视机也是封装好的，不需要里面的原理
 *          4、封装之后会形成真正的对象 是一个真正的独立体
 *          5、封装之后对于事物本身是安全的 提高了相关的安全性
 */

public class UserTest {
    public static void main(String[] args) {
        User user = new User();

        // 此处的 Uesr 里面的 age 属性是完全暴露在外面的，是不安全的，
        // 不建议这样，建议进行封装，不能随便访问属性，保证属性的安全
        // user.age = 10; 编译报错 十分的安全 彻底的访问不了
        user.setAge(10);
        System.out.println(user.getAge());

        Customer c = new Customer();

        // 方法里面的属性进行封装 安全 使用方法进行数据的反问以及修改
        // 私有的属性不可以在外部进行访问
        // 可以进行安全的控制 安全的控制是十分有必要的
        c.setAge(99);
        c.setAddr("BeiJing");
        c.setId(123456);
        c.setName("Tom");
        System.out.println(c.getAge());
        System.out.println(c.getAddr());
        System.out.println(c.getId());
        System.out.println(c.getName());

    }
}
