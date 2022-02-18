package 博客练习代码;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            // 将数组中的元素找到，寻找三个数字之和为 0 的选项，作为一个三元组进行保存
            // List<> 里面嵌套的是一个 List； 一个 List 每个 List 的单元都可以保存一个 List,实现了三元组的保存
            List<List<Integer>> list = new ArrayList<>(); // size(); ArrayList 里面使用的是 size 查看大小

            int len = nums.length;
            if (nums == null || len < 3) {
                return list;
            }
            Arrays.sort(nums);

            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) {
                    break;
                }

                if (i > 0 && nums[i] == nums[i - 1]) {
                    // 保证了 i 指向的元素是没有重复的
                    continue;
                }

                int L = i + 1;
                int R = len - 1;

                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[L], nums[R]));

                        while (L < R && nums[L] == nums[L + 1]) {
                            L++;
                        }

                        while (L < R && nums[R] == nums[R - 1]) {
                            R--;
                        }
                        L++; // 保证了 L 指向的元素是没有重复的
                        R--; // 保证了 R 指向的元素是没有重复的
                    } else if (sum < 0) {
                        L++; // 求和小于 0 ，负数的绝对值太大了，让负数的绝对值小一点，排好了顺序，向着右边移动会减小
                    } else if (sum > 0) {
                        R--; // 求和大于 0 ，正数的绝对值太大了，让正数的绝对值小一点，排好了顺序，向着左边移动会减小
                    }
                }
            }
            return list;
        }
    }
}