package com.基础课程代码练习.数据结构与算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 10:41 下午
 */
public class HashMapTest {
    public static int[] twoSum(int[] nums,int target){
        int len = nums.length;

        // 初始化哈希表的时候，将其大小进行固定，防止扩容
        Map<Integer,Integer> hashMap = new HashMap<>(len - 1);

        // 第一个元素之前没有相关的元素与之对应所以第一个位置放第一个元素
        hashMap.put(nums[0],0);

        // 从第一个元素开始进行与前面的元素比较，满足目标值减去一个已知值的差
        for (int i = 1;i < len;i++){
            // i 是取到的元素，利用它寻在 另一个和它匹配的数值
            int anotherNumber = target - nums[i];

            // 查询在哈希表中的值是否存在目标值
            if (hashMap.containsKey(anotherNumber)){
                int[] outPut = new int[2];

                outPut[0] = i;

                // 存在的目标值，将其在数组中的位置进行记录
                outPut[1] = hashMap.get(anotherNumber);

                System.out.println("最终的元素的下标为：" + outPut[0] + "   " + outPut[1]);
                System.out.println(nums[i] + " + " + nums[outPut[1]] +  " = " + target);

                // 将得到的数组下标进行返回
                return new int[]{i,hashMap.get(anotherNumber)};
            }
        }
        throw new IllegalArgumentException("找不到这样的两个数，使之两个数的加法结果为目标值");
    }

    public static void main(String[] args) {
        int[] testArray = {50,7,11,210,456,87,98};
        int[] array = {3,7,11,67};

        int a = 87 + 456;
        twoSum(testArray,260);
        System.out.println("++=============================++");

        twoSum(array,70);
        System.out.println("++=============================++");
    }
}
