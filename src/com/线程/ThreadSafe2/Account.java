package com.线程.ThreadSafe2;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/9 4:11 下午
 */

/**
 * 银行账户
 *      在账户里面，使用了线程同步的机制即当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，
 *      其他线程才能对该内存地址进行操作，而其他线程又处于等待状态，实现线程同步的方法有很多；
 *
 * 使用了线程同步的机制，可以解决线程安全的问题
 */
public class Account {
    // 账号
    private String actno;

    // 账户的余额
    private double balance;

    // 这是一个实例变量， Account 对象是多线程共享的，Account 对象中的实例变量 obj 也是共享的；
    Object obj = new Object();

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 取款方法
    public void withdraw(double money) {
        // 以下这几行代码必须是排队执行的，不能并发
        // 一个线程将这里所有的代码执行结束之后，另外一个线程才可以开始执行
        // 使用线程同步机制
        // 关键字：synchronized() 线程同步的关键字
        /**
         * 线程同步机制的语法如下所示：
         *      synchronized() {
         *          线程同步代码块
         *      }
         *
         *      synchronized 后面小括号的数据十分重要，里面放的是多线程共享的数据，才能达到多线程排队
         *      () 里面写什么呢？
         *          想让什么线程同步？
         *              假设 t1 t2 t3 t4 t5 有 5 个线程，只希望 t1 t2 t3 排队， t4 t5 不需要排队，怎么处理？
         *              在() 中写一个 t1 t2 t3 共享的对象，而这个对象对于 t4 t5 来讲，不是共享的；
         *
         *          迷糊的地方？
         *              在小括号里面我们应该填写什么呢？
         *                  谁是共享的对象呢，账户对象是共享的，this 就是账户对象
         *
         * 在 Java 中没有对象都有自己的一把锁，这个锁只是一个标记，只是叫锁，100 个对象 100 个锁
         *      下面的代码的执行原理：
         *          1、假设 t1 t2 线程并发，开始执行下面代码的时候，肯定一个先，一个后
         *          2、假设 t1 先执行了，遇到了 synchronized ，这个时候自动寻找"后面共享对象"的对象锁
         *             找到之后，占有这把锁，然后执行同步代码块里面的内容，在程序的执行过程中，是会一直占有这把锁的，
         *             知道同步代码块结束的时候，这把锁才会释放；
         *          3、假设 t1 已经占有了这把锁，此时 t2 也遇到了 synchronized 关键字，也是会占有后面共享对象的这把锁，这把锁被t1 占掉了
         *             t2 在外面等待 t1 执行结束后，t1 执行结束后，归还这把锁，t2 等到了锁开始执行；
         *
         *          这样就会达到线程排队执行的操作，保证线程之间的运行是不会相互影响的，保护了数据的安全；
         *              需要注意的是：这里的共享对象是一定需要选择好的；共享对象一定是需要排序的线程对象之间共享的；
         *
         *          共享对象是比较重要的；
         *
         *          线程进入锁池，找到共享对象的对象锁的时候，会先放弃掉之前占有的 CPU 时间片，找到锁的时候，会进入就绪状态，抢CPU 时间片；
         *          找不到的时候，就继续等待；
         *          进入锁池，可以理解为进入一种阻塞状态；
         */

        // Object obj = new Object() 这里是一个局部变量，每个线程线程进来都会执行这个代码，这个对象不是共享的，所以不能使用，需要写在
        // 外面，当作共享对象；
        // 执行起来就不是安全的；
        // 每一次进来都是会创建新的对象，局部，不是共享对象
//        synchronized ("abc") { // 多线程共享的对象写上去就行；
            // "abc"  因为创建在了字符串常量池里面 ； 所有的线程都是会同步的，所有的线程都会同步
            // synchronized 代码块里面的内容是比较多的，那么运行的效率相对来讲是比较低下的，代码块里面的代码比较少的时候，运行效率高一些
            double before = this.getBalance();
            double after = before - money;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 更新余额
            // 当 t1 执行到了这里的时候，但是下面的余额还没有更新，t2 这个时间点进来了，一定会出现问题
            this.setBalance(after);
//        }
    }
}