package temp;

/**
 * @author Doraemon
 * @date 2021/11/23 3:38 下午
 * @version 1.0
 */
public class Test11 {
    public static void main(String[] args) {

        // 2000 毫秒左右
//        //String
//        long startTime = System.currentTimeMillis();
//        String str = "";
//        for (int i = 0; i < 50000; i++) {
//            str += i;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("String类型操作耗时" + (endTime - startTime) + "毫秒");

        // 5毫秒左右
//StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 50000; i++) {
            str.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer类型操作耗时" + (endTime - startTime) + "毫秒");

    }
}
