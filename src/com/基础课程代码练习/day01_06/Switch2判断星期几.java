package com.基础课程代码练习.day01_06;

public class Switch2判断星期几 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用简单计算机计算系统！");
        System.out.print("请输入第一个数字：");
        int num1 = s.nextInt();

        System.out.print("请输入计算符号:");
        String operator = s.next();

        System.out.print("请输入第二个数字：");
        int num2 = s.nextInt();

        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.print("计算符号输入错误！");
        }

        System.out.println(num1 + operator + num2 + " = " + result);
    }
}
