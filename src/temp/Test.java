package temp;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/10/28 3:49 下午
 */
public class Test {
    public static void main(String[] args) {
        String s = "GEOSPATIAL DATA PR OCESSING FOR 3D CITY MODEL GENER ATION, MA NAGEMENT AND\n" +
                "VISUALIZATION";
        System.out.println(s.toLowerCase());
        System.out.println(Math.pow(2, 31));
        System.out.println(Math.pow(2, 15));
        @SuppressWarnings(value = "s1")
        String s1; // 使用了转义字符，可以满足输出相关自己想要的东西
        s1 = "d:\\core\\test";
        System.out.println(s1);
        char ch1 = 65;
        char ch2 = 'A';
        System.out.println(100 + '\n' + 100);
        System.out.println(0.0 / 0.0);
        System.out.println(10.0 / 0.0);
        System.out.println();
        System.out.println("哈希值为：" + s1.hashCode());
        int i = 130;
        char ch3 = (char) i;
        System.out.println(ch3);
        System.out.println(100 >> 2);


    }

}