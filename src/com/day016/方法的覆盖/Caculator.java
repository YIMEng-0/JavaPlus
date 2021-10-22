package com.day016.方法的覆盖;

public class Caculator {
    public static void main(String[] args) {
        double data[] = new double[8];
        data[0] = 18071;
        data[1] = 21351;
        data[2] = 23940;
        data[3] = 26053;
        data[4] = 27235;
        data[5] = 30785;
        data[6] = 38734;

        double result[] = new double[8];
        int i= 0;
        for (i = 0;i < 7;i++){
            result[i] = (data[i+1] - data[i]) / data[i];
            System.out.println(data[i]);
            System.out.println(result[i]);
        }
    }
}
