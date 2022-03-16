package temp;

/**
 * @author Doraemon
 * @date 2022/3/14 8:16 下午
 * @version 1.0
 */
public class 翻转单词 {
    public static void main(String[] args) {
        String s = "hello world";
        StringBuilder stringBuilder = removeSpace(s);
        System.out.println(stringBuilder);

        String string = reverseString(stringBuilder);
        System.out.println("字符串颠倒后的结果为：" + string);

    }

    /**
     * 字符串里面的空格进行剔除
     * @param s
     * @return
     */
    public static StringBuilder removeSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp != ' ') {
                stringBuilder.append(temp);
            }
        }

        return stringBuilder;
    }

    /**
     * 翻转整个字符串
     * @param s
     * @return
     */
    public static String reverseString(StringBuilder s) {
        // 创建一个新的 char[] 数组，将 StringBuilder 的数据，从后面进行放置，转换成String 传递出去
        char chars[] = new char[s.length()];
        int index = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            chars[index] = s.charAt(i);
            index--;
        }

        String string = new String(chars);
        return string;
    }
}