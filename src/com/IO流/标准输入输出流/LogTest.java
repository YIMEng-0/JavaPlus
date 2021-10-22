package com.IO流.标准输入输出流;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/6 10:31 下午
 */

/**
 * 测试工具类是否是好用的
 */
public class LogTest {
    public static void main(String[] args) throws Exception {
        logUtil.log("掉用了 System 类中的方法，建议启动垃圾回收");
        logUtil.log("用户输入错误");
        logUtil.log("遇到了无法解决的错误");
    }
}
