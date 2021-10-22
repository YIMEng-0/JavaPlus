package com.线程.ThreadExam;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/10 6:17 下午
 */
// 1、
// doOther 的执行需要等待 doSome方法执行结束吗？
// 不需要，因为 doOther 没有 synchronized ，没有锁;所以在这个地方是不需要排队处理的

// 2、
// 当两个方法都用了 synchronized 进行修饰的时候，就会出现排队的效果，只有一把锁


// 3、
// 当创建出来了两个 MyClass 对象，拥有两把锁，两者之间是没有影响的，不会排队

// 4、synchronized 出现在了静态方法上面，表示的是类锁，两个线程是需要等待的
// 类锁是不需要管创建了几个对象的，因为类锁只有 1 把
// 锁的机制 排它锁，自己拿到了对象，就是自己拿到了锁，不允许其他的线程拿到这把锁；
public class Exam01 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new MyThreadTest(mc1);
        Thread t2 = new MyThreadTest(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        // 睡眠的作用：保证 t1 线程先执行；
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}

class MyThreadTest extends Thread {
    private MyClass mc;

    public MyThreadTest(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }

        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }
}

class MyClass {
    // synchronized 出现在了实例方法上面，表示锁定的是 this
    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("soSome over");
    }

    public synchronized void doOther() {
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}