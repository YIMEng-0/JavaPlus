package com.集合.代码实现;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/9/28 8:45 下午
 */

/**
 * 放在集合中的元素，需要重写 equals() 方法，不重写比较的是内存地址，重写了比较的是里面的内容；
 * 调用重写之后的方法；
 *
 * Conclusion 存放在集合中的元素一定需要重写 equals() 方法
 */

/**
 * contains()
 * 判断集合中是否存在相关的元素
 *
 * remove()
 * 删除相关的元素
 *
 * 两者在底层中都调用了 equals() 方法，如果重写了 equals() 方法，Java 会认为两者是一个东西，可能会同时删除
 *      equals(方法的重写是关于对象的方法的重写，不是集合的方法的重写 equals())
 */

/**
 * 放在集合中的元素，需要重写 equals() 方法；传进去的是自己创建的对象的时候，需要对于对象的 equals() 方法进行重写
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        // 创建用户对象
        // 虽然在这里 new 了两个不同的对象，但是在底层中，相关的类 对于 equals() 方法进行了重写，所以在其下面比较的是两个对象的实际内容
        User u1 = new User("Jack");
        User u2 = new User("Jack");

        c.add(u1);

        // 判断集合中是否包含 u2
        System.out.println(c.contains(u2)); // 没有对于 equals 重写之前，这个的结果是 false
        // 底层的执行顺序：u1.equals(u2); 没有方法的重写，比较的是创建出来的对象的地址，这里显然是不同的
        // 对于类，所有的类都是继承 Object 方法的，里面有 equals() 方法，需要重写，才能实现自己想要的方法；
        // 没有在自己的类中重写相关的方法，执行父类中的方法
        // Object 方法中是使用 == 进行比较的






        // 测试 remove 中有没有重写 equals() 方法
        Collection c2 = new ArrayList();
        String s1 = new String("Hello");

        String s2 = new String("Hello");

        c2.remove(s2);
        // 底层对于元素 s2 删除，就是对于 s1 的删除，因为Java 认为 s1 和 s2 就是一个东西
        // 当没有重写 equals（） 方法的时候，还是会调用，这个时候Java 会认为不是一个东西，只会删除一个
        System.out.println(c2.size()); // 0 已经删除 里面的大小为 0 ；删除了 s2 s1 也没有了
    }
    // 下面的代码中是 ArrayList（） 里面的方法，在 remove() 执行的时候，对于 equals（） 方法进行了调用
//    public boolean remove(Object o) {
//        final Object[] es = elementData;
//        final int size = this.size;
//        int i = 0;
//        found: {
//            if (o == null) {
//                for (; i < size; i++)
//                    if (es[i] == null)
//                        break found;
//            } else {
//                for (; i < size; i++)
//                    if (o.equals(es[i]))
//                        break found;
//            }
//            return false;
//        }
//        fastRemove(es, i);
//        return true;
//    }
}



class User {
    private String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    // 重写的比较方法，只要是名字一样，返回的就是 true
    @Override
    public boolean equals(Object o) {
        // 当传进来的数据为空 或者 是 User 的数据类型的时候，一定为假
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User) o;

        // 如果两个之间的名字是相同的，那么返回的就是 true
        return u.name.equals(this.name);
    }
}