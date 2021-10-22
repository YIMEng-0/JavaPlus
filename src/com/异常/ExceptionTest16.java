package com.异常;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/24 8:08 下午
 */
public class ExceptionTest16 {
    public static void main(String[] args) {
        // 创建异常对象 （对于异常对象，只是创建，没有抛出）
        MyException01 e = new MyException01("用户名不能为空");

        // 打印异常的堆栈信息
        e.printStackTrace();

        // 获取异常的简单描述信息
        String msg = e.getMessage();
        System.out.println(msg);
    }
}
