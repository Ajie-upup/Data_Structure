package Mode00_LeetCode.class03_哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code03_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(nums.length-1);
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
