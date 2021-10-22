package com.day011;

/*
    封装 好了 对外操作 外壳 方便操作
    复杂的问题封装 进行简单的操作
    get 和 set 方法不带 static ；有自己的命名方法，进行编写
    构造方法不需要写返回值类型 因子返回值类型就是自己，每次要多此一举
    引用可以为成员变量 也是一个变量而已
 */

/*
    this 关键字的学习
    magic 关键字
    1、这是一个关键字 翻译为 ： 这个
    2、在对象的内部创建一个对象，对象里面有一个 this 这个保存对象的首地址，指向自己 保存地址本身
    3、this 关键字指向自己 ， this 出现在堆内存中，是一个变量 每个对象都有自己的 this
    4、this 就是 c1 ; this 就是c2 ; 在访问对象的过程中
    5、当使用 c1 区访问对象的时候 this 就是 c1;当使用 c2 访问对象的时候， this 就是 c2 ; this 表示当前正在执行这个动作的对象
    6、this 在多数情况之下是可以省略不写的
    7、this 不能在带有 static 的方法中使用
 */

// 一个程序只有一个 public
public class this关键字学习 {
    public static void main(String[] args) {
        // 创建Customer 对象
        Customer customer1 = new Customer();
        customer1.name = "Jack";
        customer1.shopping();

        Customer customer2 = new Customer();
        customer2.name = "Tom";
        customer2.shopping();

        // 方法的调用 doSome 方法 ；
        // 发现方法名字的前面有static 需要使用类名点进行调用
        // 下面的方法在执行的时候不需要对象的参加 ， 通过类进行调用
        Customer.doSome();

    }
}

class Customer{
    String name;
    public Customer(){
        // 每一个顾客的最终结果是不一样的
        // 所以购物的行为属于对象级别的行为 购物这个动作必须有对象的参加
        // 没有 static 关键字的方法叫做实例方法
        // 没有 static 的变量叫做实例变量 需要使用 引用点进行访问，在堆中进行存储
        // 实例方法通过引用点进行访问，必须有对象的参与，必须用引用，不是用类
        // 当一个行为，一个动作，执行的过程当中需要对象的参与，那么方法的定义一定需要定义为实例实例方法，前面不加 static ，使用引用点
        // 有对象参加的方法 上面是不加 static 的 ，比如 set ,get 方法 ，对象的参与

    }

    // 对象定义为实例方法，因为方法的调用里面需要有对象的参与
    public void shopping(){
        // 使用不同的人返回不同的人在购物
        // System.out.println( name + " is shopping");

        // 完整的写法：
        // this 可以是 c1 也可以是 c2 ，神奇之处
        // this 表示当前正在执行这个动作的对象

        // 由于 name 是一个实例变量 所以 name 访问的时候，一定是当前队形的 name
        // 不加上 static 的变量都叫做实例变量， static 的是静态变量
        System.out.println(this.name + " is shopping");

    }

    public static void doSome(){
        // 执行的时候没有所谓的当前对象 ， 带有 static 是通过类名进行访问的，不存在 this ；this 指的是当前的对象
        // this 的不能在带有 static 的方法当中进行使用
        // System.out.println(name);
        // 对象的使用，使用this
        // static 执行的过程中不需要对象，直接使用类名，所以执行过程中没有当前对象


        // 假设想访问 name 实例变量 ，应该怎么做？
        // 创建对象进行访问
        Customer c= new Customer();
        System.out.println(c.name); // 这里访问的 name 指的是 c 引用指向对象的 name


    }
}
