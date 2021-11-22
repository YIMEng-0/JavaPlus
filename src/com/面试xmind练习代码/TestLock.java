package com.面试xmind练习代码;
// https://www.cnblogs.com/www-123456/p/10970048.html 代码来源
/**
 * @author Doraemon
 * @date 2021/11/21 11:43 上午
 * @version 1.0
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    // ReentrantLock为Lock的唯一实现类
    private Lock lock = new ReentrantLock();

    /**
     * 测试使用lock 的 lock()方法 ：如果锁已经被其他线程获取，则等待
     * @param thread
     */
    public void testLock(Thread thread){
        try {
            lock.lock();
            System.out.println("线程 " + thread.getName() + " 获取了锁！");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("线程 " + thread.getName() + " 释放了锁！");
            // 必须在 finally 中释放锁，防止死锁
            lock.unlock();
        }
    }

    /**
     * 测试使用lock 的 lock()方法 ：通过这个方法去获取锁时，如果线程正在等待获取锁，则这个线程能够响应中断，即中断线程的等待状态。
     * @param thread
     */
    public void testLockInterruptibly(Thread thread){
        try {
            lock.lockInterruptibly();

            System.out.println("线程 " + thread.getName() + " 获取了锁！");
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("线程 " + thread.getName() + " 释放了锁！");
            // 必须在 finally 中释放锁，防止死锁
            lock.unlock();
        }
    }

    /**
     * 测试使用lock 的 tryLock()方法 ：如果获取成功，则返回true，如果获取失败（即锁已被其他线程获取），则返回false
     * @param thread
     */
    public void testTryLock(Thread thread){
        System.out.println("start!");
        if(lock.tryLock()){// 如果获取到了锁
            try {
                System.out.println("线程 " + thread.getName() + " 获取了锁！");
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("线程 " + thread.getName() + " 释放了锁！");
                // 必须在 finally 中释放锁，防止死锁
                lock.unlock();
            }
        }else {
            // 没有获取到锁
            System.out.println("线程 " + thread.getName() + " 没有获取到锁！");
        }

        System.out.println("end!");
    }

    /**
     * 测试使用lock 的 tryLock(long time, TimeUnit unit)方法 ：和tryLock()方法是类似的，只不过区别在于这个方法在拿不到锁时会等待一定的时间，
     * 在时间期限之内如果还拿不到锁，就返回false。如果如果一开始拿到锁或者在等待期间内拿到了锁，则返回true。
     * @param thread
     */
    public void testTryLock_time_unit(Thread thread){
        System.out.println("unit start!");
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){// 如果获取到了锁
                try {
                    System.out.println("线程 " + thread.getName() + " 获取了锁！");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    System.out.println("线程 " + thread.getName() + " 释放了锁！");
                    // 必须在 finally 中释放锁，防止死锁
                    lock.unlock();
                }
            }else {
                // 没有获取到锁
                System.out.println("线程 " + thread.getName() + " 没有获取到锁！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("unit end");
    }

    public static void main(String[] args){
        TestLock testLock = new TestLock();
        Thread a = new Thread("A") {
            @Override
            public void run() {
                /*// 测试 lock()
                testLock.testLock(Thread.currentThread());*/
                /*// 测试 lockInterruptibly()
                testLock.testLockInterruptibly(Thread.currentThread());*/
                /*// 测试 tryLock()
                testLock.testTryLock(Thread.currentThread());*/
                /*// 测试 tryLock(long time, TimeUnit unit)
                testLock.testTryLock_time_unit(Thread.currentThread());*/
                testLock.testTryLock_time_unit(Thread.currentThread());
            }
        };
        Thread b = new Thread("B") {
            @Override
            public void run() {
                testLock.testTryLock(Thread.currentThread());
            }
        };
        a.start();
        b.start();
    }
}