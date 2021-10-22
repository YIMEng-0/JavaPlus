package com.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/21 10:09 下午
 */
public class ExceptionTest02 {
    // 上抛相当于推卸责任
    // 异常抛上去，可能出现异常，不是一定会出现异常，没有出现异常 JVM 就可以进行正常的运行程序了
//    public static void main(String[] args) throws ClassNotFoundException {
//        // 第一种处理方式
//        // 在方法申明的位置，继续进行上抛操作
//        doSome();
//    }

    // try 相当于自己处理异常
    public static void main(String[] args) {
        // 第二种处理方式
        // 进行 try catch 操作
        try{
            doSome();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}