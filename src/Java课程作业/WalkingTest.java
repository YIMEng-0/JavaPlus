package Java课程作业;

import javax.swing.*;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:39 上午
 */
public class WalkingTest {
    public static void main(String[] args) {
        int n = 100;//模拟醉汉的行走步数--可以是大于0的任意数
        double max_stride = 1;//醉汉行走最长步长-可以是大于0的任意数
        DrunkWalkingProcess p = new DrunkWalkingProcess();
        p.drunkWalking(n,max_stride);
        //将醉汉每步的位置记录，并在图表中展示 -- 无需图表展示可不调用
        JFrame paint = new PaintCircle("模拟醉汉行走位置信息展现：",10,p.getLocations(),20,70,100);
    }
}
