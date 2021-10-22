package com.MyString;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/9/17 8:39 下午
 */
public class String类常用的方法 {
    public static void main(String[] args) {
        // 1 charAt
        // String 中常用的方法
        // （掌握）1、char charAt(int index);
        // 字符串是对象，对象可以调用方法，charAt对于对象中的元素从左向右进行序号建立，从而查询
        char c = "中国人".charAt(1);
        System.out.println(c);


        // 2 int compareTo
        // int compareTo(String s1);
        // 用来比较字符串的大小关系的
        // 返回结果 = 0，前后结果一致
        // 返回结果 = -1 前面的小，后面的大
        // 返回结果 = 1  前面的大，后面的小
        // 比较两个字符串的大小，前面的第一个和后面的第一个比较，能比较出来结果就不比较了
        // 字符串之间的大小比较不能使用  > < = 需要使用 compareTo
        int result = "abc".compareTo("abcd"); // 返回负数，前面的都相等，最后一位进行比较
        System.out.println(result);

        // 3 boolean contains
        // (掌握)  boolean contains(CharSequence s);
        System.out.println("hello.java".contains("java")); // true

        // 4 boolean endWith
        //（掌握）判断当前的字符串中是否以某个字符串结尾
        System.out.println("test.txt".endsWith("txt")); // true

        // 5 == equals 比较
        // == 比较的值，内存地址值或者实际的值比较
        // equals 比较的是内容是否相同
        String s6 = "abc";
        String s7 = new String("abc");
        System.out.println(s6 == s7);
        System.out.println(s6.equals(s7));

        // 6 boolean equalsIgnoreCase 对字符串进行比较，忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc"));

        /**
         * equals 只能看出来是否相等
         * compareTo 可以看出是否相等，并且大小关系
         */

        // 7 将字符串转换成为字节数组
        String s8 = "abcd";
        byte[] bytes1 = s8.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes1);
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }

        // 8 int indexOf(String str)
        // 判断某个字符串在当前字符串中第一次出现的索引
        System.out.println("hello".indexOf("o"));

        // 9 判断字符串是否为空
        String s9 = "a";
        System.out.println(s9.isEmpty());

        // 10 int length
        // 面试题：判断数组长度和判断字符串长度不一样
        // 数组里面使用的是 length 属性，判断字符串长度使用 length()方法
        // 可以使用 length 判断是否是空的，长度为 0 ，当然就是空的
        System.out.println("sdfhjaskdncsdjfjkasd".length());

        // 11 int lastIndexOf
        // 判断当前的字符在字符串中最后出现一次的索引
        System.out.println("ajcasdnsdsfasd".lastIndexOf("fasd"));

        // 12 String replace(CharSequence target,CharSequence replacement);
        // String 的父接口是：CharSequence
        String newString = "www.baidu.com".replace("baidu","taobao");
        System.out.println(newString);

        String newString2 =  "name = Kack Pass = 123".replace("=",":");
        System.out.println(newString2);

        // 13 String[] split(String regex)
        // 拆分字符串
        String[] ymd =  "1999 - 12 - 20".split("-"); // 根据 - 将字符串进行拆分
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }

        String param = "username = Jack & password = 123 & age = 20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }

        // 14 boolean startWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始
        System.out.println("www.baidu.com".startsWith("www.")); // true

        // 重载的方法，方法的名字是一样的，但是得到的结果是不一样的
        // 16 subString(int beginIndex) 截取字符串
        System.out.println("www.baidu.com".substring(4)); // baidu.com
        // began 开始 end 结束 左边是包含的，右边是不包含的
        System.out.println("www.baidu,com".substring(0,3)); // www 左闭右开的区间

        // 17 char[] toCharArray()
        // 将字符串转换为 char 数组
        char[] chars = "hello world".toCharArray();
        for (int i = 0; i < chars.length;i++) {
            System.out.println(chars[i]);
        }

        // 18 String toLowerCase()
        // 将字符串转换为小写
        System.out.println("HJHKHJ".toLowerCase(Locale.ROOT));

        // 19 String toUpperCase()
        // 将字符串转换为大写
        System.out.println("sdalj".toUpperCase(Locale.ROOT));

        // 20 String trim()
        // 去处字符串前面和后面的空格
        // 中间的空格是不会去掉的
        System.out.println("  s  d  f   ".trim());

        // 21 String 中只有一个方法是静态的不需要 new 对象
        // valueOf
        // 作用：将非字符串转换为 字符串
        String s11 = String.valueOf(3.14);
        System.out.println(s11);

        String s12 = String.valueOf(new Customer());
        // valueOf() 方法里面传入的参数是对象的引用的额时候，会自动调用该方法的 toString 方法；
        System.out.println(s12); // 没有重写 toString 之前，调用的是 Object 中的方法，实际为对象的内存地址

        /**
         * 为什么输出引用的时候，为什么调用 toString()?
         *  因为在 println 函数里面使用了 valueOf() 的方法，转换成为字符串打印，valueOf()这个方法是会调用 toString 这个方法的
         *
         *  valueOf() 将非字符串的东西转换成为字符串，所以说在控制台中打印的所有东西都是字符串
         *  控制台上面的都是串；
         *  sout 在输出任何数据类型的时候，都是先转换为字符串，然后在输出
         */
    }
}

class Customer{
    @Override
    public String toString() {
        return "这里是 VIP 专用通道";
    }
}