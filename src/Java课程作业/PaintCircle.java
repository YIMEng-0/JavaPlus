package Java课程作业;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:41 上午
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.List;
import javax.swing.JFrame;

/**画图类:
 * 根据传入的点和颜色，显示醉汉的行走落点位置，和最终距离原点的距离
 */
public class PaintCircle extends JFrame  {
    private int r;
    private List<Location> locations;
    private int W_H = 750;
    private int R;
    private int G;
    private int B;
    public PaintCircle(String title, int r,List<Location> locations,int R,int G,int B){
        this.r = r;
        this.locations = locations;
        this.R = R;
        this.G = G;
        this.B = B;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setBackground(Color.white);//设置背景颜色
        this.setSize(W_H, W_H);//设置窗口大小
        //该方法会调用子类的paint重写方法，画出相应paint中的图形
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        Color color = new Color(R,G,B);
        g.setColor(color);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        double max_loc = getMaxLocation()+5;
        int deviation = 25;//上下左右偏离
        int scale = (int) Math.floor((W_H-25*2)/max_loc)-1;//缩放比例
        g.drawString("蓝色点：为醉汉位置", deviation-10,deviation+20);
        g.drawString("红色线：为醉汉最终位置到原点的距离", deviation-10,deviation+35);
        //画出x\y坐标轴
        g.drawString("起始点(0,0)", (W_H-25*2)/2+deviation-20,(W_H-25*2)/2+deviation+10);
        g.drawString("起始点(0,0)", (W_H-25*2)/2+deviation-20,(W_H-25*2)/2+deviation+10);
        drawAL(deviation,(W_H-25*2)/2+deviation, (W_H-25*2)+deviation, (W_H-25*2)/2+deviation, g2);
        g.drawString("X",  (W_H-25*2)+deviation, (W_H-25*2)/2+deviation+10);
        drawAL((W_H-25*2)/2+deviation,(W_H-25*2)+deviation, (W_H-25*2)/2+deviation,deviation, g2);
        g.drawString("Y", (W_H-25*2)/2+deviation-10,deviation+20);
        //画出x\y轴上标尺
        drawXYScale(g,scale,deviation);
        //坐标转换-显示每个位置点（圆），并显示终点到原点的直线
        int init_xy = (W_H-25*2)/2+deviation;//原点x/y
        int x,y;
        g.setColor(Color.BLUE);
        if(locations != null && locations.size() > 0){
            for(int i = 0;i<locations.size()-1;i++){
                x = (int)(init_xy+locations.get(i).getX()*scale);
                y = (int)(init_xy+locations.get(i).getY()*scale);
                g.fillArc(x, y, r,r, 0, 360);
            }
            g2.setColor(Color.red);
            g.setColor(Color.red);
            x = (int)(init_xy+locations.get(locations.size()-1).getX()*scale);
            y = (int)(init_xy+locations.get(locations.size()-1).getY()*scale);
            g.fillArc(x-r/2,y-r/2, r+2,r+2, 0, 360);
            drawAL(init_xy,init_xy, x,y,g2);
        }
    }
    private void drawXYScale(Graphics g, int scale, int deviation) {
        int x = (W_H-deviation*2)/2+deviation;
        int y = (W_H-deviation*2)/2+deviation;
        g.setColor(Color.black);
        int i = 1;
        int x1 = x,x2 =x;
        int r = this.r/2;
        while(x1>deviation && x2 < ((W_H-deviation*2)+deviation)){
            x1 = x1 - scale;
            g.fillOval(x1-r/2, y-r/2, r, r);
            g.drawString(-i+"", x1-2, y+15);
            x2 = x2 + scale;
            g.fillOval(x2-r/2, y-r/2, r, r);
            g.drawString(i+"", x2-2, y+15);
            i++;
        }
        int y1 = x,y2 = x;
        i = 1;
        while(y2>deviation && y1 < ((W_H-deviation*2)+deviation)){
            y1 = y1 + scale;
            g.fillOval(x-r/2, y1-r/2, r, r);
            g.drawString(-i+"", x+10, y1-2);
            y2 = y2 - scale;
            g.fillOval(x-r/2, y2-r/2, r, r);
            g.drawString(i+"", x+10, y2-2);
            i++;
        }
    }
    private double getMaxLocation() {
        double max_x = 0;
        if(locations != null && locations.size() > 0){
            for(Location loc:locations){
                max_x = Math.abs(loc.getX()) > max_x ? Math.abs(loc.getX()):max_x;
                max_x = Math.abs(loc.getY()) > max_x ? Math.abs(loc.getY()):max_x;
            }
        }
        return max_x;
    }
    /**画带箭头的直线*/
    public void drawAL(int sx, int sy, int ex, int ey, Graphics2D g2){
        double H = 10; // 箭头高度
        double L = 4; // 底边的一半
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        double awrad = Math.atan(L / H); // 箭头角度
        double arraow_len = Math.sqrt(L * L + H * H); // 箭头的长度
        double[] arrXY_1 = rotateVec(ex - sx, ey - sy, awrad, true, arraow_len);
        double[] arrXY_2 = rotateVec(ex - sx, ey - sy, -awrad, true, arraow_len);
        double x_3 = ex - arrXY_1[0]; // (x3,y3)是第一端点
        double y_3 = ey - arrXY_1[1];
        double x_4 = ex - arrXY_2[0]; // (x4,y4)是第二端点
        double y_4 = ey - arrXY_2[1];

        Double X3 = new Double(x_3);
        x3 = X3.intValue();
        Double Y3 = new Double(y_3);
        y3 = Y3.intValue();
        Double X4 = new Double(x_4);
        x4 = X4.intValue();
        Double Y4 = new Double(y_4);
        y4 = Y4.intValue();
        // 画线
        g2.drawLine(sx, sy, ex, ey);
        //
        GeneralPath triangle = new GeneralPath();
        triangle.moveTo(ex, ey);
        triangle.lineTo(x3, y3);
        triangle.lineTo(x4, y4);
        triangle.closePath();
        //实心箭头
        g2.fill(triangle);
        //非实心箭头
//		g2.draw(triangle);

    }
    /**计算
     * @param px
     * @param py
     * @param ang
     * @param isChLen
     * @param newLen*/
    public double[] rotateVec(int px, int py, double ang,
                              boolean isChLen, double newLen) {
        double mathstr[] = new double[2];
        // 矢量旋转函数，参数含义分别是x分量、y分量、旋转角、是否改变长度、新长度
        double vx = px * Math.cos(ang) - py * Math.sin(ang);
        double vy = px * Math.sin(ang) + py * Math.cos(ang);
        if (isChLen) {
            double d = Math.sqrt(vx * vx + vy * vy);
            vx = vx / d * newLen;
            vy = vy / d * newLen;
            mathstr[0] = vx;
            mathstr[1] = vy;
        }
        return mathstr;
    }
}
