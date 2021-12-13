package temp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Doraemon
 * @version 1.0
 * @date 2021/11/4 11:33 上午
 */

/**
 * hashMap hashTable 基本已经废掉了
 */
public class MyHashMap {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,23,25};
        int[] res = twoSum(arr,25);
        for (int i = 0; i < res.length; i++) {
            System.out.println( "数组的下标为 ： " + res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            hashMap.put(nums[i], i);// key(原来的数组里面的数值)  value（索引） 下面使用数值获取索引
            if (hashMap.containsKey(target - nums[i])) {
                // 如果在哈希表中存在一个元素的话，返回存在那个数的下标
                return new int[]{hashMap.get(target - nums[i]), i}; // 两数字之和，所以返回的是两个下标
            }
        }
        return new int[0];
        
    }
}