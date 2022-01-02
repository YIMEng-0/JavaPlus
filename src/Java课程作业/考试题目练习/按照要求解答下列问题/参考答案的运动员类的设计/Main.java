package Java课程作业.考试题目练习.按照要求解答下列问题.参考答案的运动员类的设计;

/**
 * @author Doraemon
 * @date 2021/12/22 8:57 下午
 * @version 1.0
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 创建出来一个数组，保存多个比赛
        Match[] match = new Match[3];

        double[] first = {9.1, 8.2, 7.3, 8.4, 8.6};
        double difficulty = 1.98;
        Scores s1 = new Scores(difficulty, first);
        Athlete a1 = new Athlete("John Hill", "0001");

        // 将上面构造好的分数，运动员作为参数，创建比赛
        match[0] = new Match(a1, s1);

        Scores s2 = new Scores(2.01, 9.0, 8.5, 8.1, 9.0, 8.0);
        Athlete a2 = new Athlete("Alun Karl", "0002");
        // 另外一种方式，创建第二个比赛
        match[1] = new Match(a2, s2);

        Scores s3 = new Scores(1.80, 7.0, 8.5, 7.1, 9.0, 8.0);
        Athlete a3 = new Athlete("Lin Ma", "0003");

        // 创建出来第三个比赛，方式一样，前面创建构造比赛的必要构建 也就是 s3 a3 ；
        match[2] = new Match(a3, s3);

        System.out.println("===名字排名===");

        /**
         * Arrays.sort（） 是 JDK 自己携带的工具方法，直接调用可以实现排序
         * 首先Comparable< T t >是一个接口其中有一个抽象方法compareTo，当sort方法参数传入自定义对象数组时，
         * 我们跟随源码可以看到最终是以Comparable< T t >这个接口关联到参数数组中对象所在的类中的compareTo方法进行排序的，
         * 因此参数对象所对应的类必须实现Comparable< T t >接口，并且重写compareTo方法规定排序策略
         * 在这个程序中，在 Match 里面是已经实现了接口，并且已经重写了 compareTo 方法的，所以可以进行自定义数据类型的排序操作
         */

        // 下面的代码使用了 姓名进行了选手的排名
        Arrays.sort(match,(m1,m2) -> m1.compareTo(m2)); // 按照选手的姓名排序
        for (Match m : match) {
            System.out.println(m.getAthleteNo() + "," + m.getName() + ":" + m.getFinalScore());
        }

        System.out.println("===分数排名===");

        /**
         * 下面的使用了分数进行了排名，分数是从低到高依次进行排名的
         * 使用了 lambda表达式 的方式
         * https://zhidao.baidu.com/question/1388165155373946540.html 参考博客
         * https://github.com/YIMEng-0/JavaPlus/blob/main/javaSE%E5%A4%8D%E4%B9%A0%E5%87%86%E5%A4%87/java%E5%9F%BA%E7%A1%80/lanbda%E8%A1%A8%E8%BE%BE%E5%BC%8F%E5%92%8C%E5%86%85%E9%83%A8%E7%B1%BB.xmind
         */
        Arrays.sort(match, (m1, m2) -> Double.compare(m1.getFinalScore(), m2.getFinalScore()));

        // 获取最后的编号，名字，分数进行输出即可
        for (Match m : match) {
            System.out.println(m.getAthleteNo() + "," + m.getName() + ":" + m.getFinalScore());
        }
    }
}