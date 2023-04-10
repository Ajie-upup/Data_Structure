package Mode00_LeetCode.class03_哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/10
 * @description: 双指针法
 */
public class code04_三数之和 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int start = 0; start < nums.length - 2; start++) {
            if (nums[start] > 0) {
                // 排序后的三个数字相加，如果第一个数字大于0，则结果一定大于0
                break;
            }
            if (start > 0 && nums[start] == nums[start - 1]) {
                // 去除重复解
                continue;
            }
            int left = start + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[start] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[start], nums[left], nums[right])));
                    // 去除重复解
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 去除重复解
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 同一组下可能存在不同的解
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
