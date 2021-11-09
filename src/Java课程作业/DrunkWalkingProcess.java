package Java课程作业;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/9 8:41 上午
 */
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * 模拟醉汉行走问题：
 * 每走一步用随机方法生成步长和方向，每一步可用一个矢量表示，
 * 将这些矢量累加起来可以计算出醉汉最后走出的距离和方向。
 * 通过模拟实验，评估其走路的效率
 * @author Administrator
 *
 */
public class DrunkWalkingProcess {
    //醉汉行走过程中的位置信息
    private List<Location> locations = new ArrayList<Location>();
    //醉汉距离原点的距离
    private double distance = 0;
    /**
     * 模拟醉汉行走算法实现
     * @param n 模拟醉汉的行走步数--可以是大于0的任意数
     * @param max_stride 醉汉行走最长步长 --可以是大于0的任意数
     */
    public void drunkWalking(int n,double max_stride){
        locations.add(new Location(0,0));//原点
        Location current_loc = new Location();//醉汉当前位置
        double stride = 0;//步长
        double direction = 0;//方向
        for(int i = 0; i<n ; i++){
            System.out.println("醉汉行走第"+(i+1)+"步： ");
            stride = getRandom(0,max_stride);//当前步长
            direction = getRandom(0,360);//当前方向
            current_loc.setX(formatDouble(current_loc.getX()+stride*Math.cos(direction),3));
            current_loc.setY(formatDouble(current_loc.getY()+stride*Math.sin(direction),3));
            //距离原点距离 = sqrt(x**2 + y**2)
            distance = formatDouble(Math.sqrt(Math.pow(current_loc.getX(),2)+Math.pow(current_loc.getY(),2)),4);
            locations.add(new Location(current_loc.getX(),current_loc.getY()));
            System.out.println("步长:"+stride+"(米) "
                    + " 方向"+direction+"(度) "
                    + " 位置:("+current_loc.getX()+","+current_loc.getY()+")"
                    + " 到原点距离:"+distance+"(米) ");
        }
        //假设正常人以max_stride步长，同方向行走n步，到原点距离为：n*max_stride
        double effectiveness = formatDouble(distance/n*max_stride,4);//行走效率
        System.out.println("醉汉行走效率为："+effectiveness*100+"%");
    }
    /**生成一定范围内的随机数
     * @param min 最小值
     * @param max 最大值*/
    public double getRandom(double min,double max){
        return formatDouble(Math.random()*(max-min)+min,3);
    }
    /**保留小数点位数
     * @param d
     * @param n*/
    public double formatDouble(double d,int n){
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(n);
        return Double.parseDouble(nf.format(d));
    }
    public List<Location> getLocations() {
        return locations;
    }
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}


