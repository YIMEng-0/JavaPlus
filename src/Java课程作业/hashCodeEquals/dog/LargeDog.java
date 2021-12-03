package Java课程作业.hashCodeEquals.dog;

import java.util.Objects;

public class LargeDog extends Dog {
    private double weight;

    public static void info() {
        System.out.println("LargeDog类描述巨型犬。");
    }

    public LargeDog(int weight) {
        this.weight = weight;
    }

    public LargeDog(String name, String color, double age, double weight) {
        super(name, color, age);
        this.weight = weight;
    }

    @Override
    public void run() {
        System.out.println("我可以跑的飞快！");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("weight:" + weight);

    }

    public double getWight() {
        return weight;
    }

	// 进行 equals hashCode 方法的重写
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LargeDog largeDog = (LargeDog) o;
		return Double.compare(largeDog.weight, weight) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(weight);
	}
}
