package Mode04_FallingInLove.Season3.class_精选面试100;


import java.util.HashMap;

/**
 * @author ajie
 * @date 2023/4/23
 * @description:
 */
public class code001_两数之和 {
    /**
     * 数组元素无序，需要返回数组元素在原始数组中的下标
     * 故不能使用双指针算法
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
