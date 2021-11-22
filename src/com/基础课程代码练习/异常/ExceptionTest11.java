package com.基础课程代码练习.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 5:52 下午
 */
public class ExceptionTest11 {
    public static void main(String[] args) {

        // 在 try catch 中，先执行 try 再执行 finally 最后执行 return;
        try {
            System.out.println("try...");

            // 退出了 Java 虚拟机 后面的 finally 也是不会执行的，因为在这里的虚拟机都已经退出了，后面的程序全部不执行了；
            System.exit(0);
        }finally {
            System.out.println("finally...");
        }

//        System.out.println("csd");  这里的语句是无法执行到的；
    }
}