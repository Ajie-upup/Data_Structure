package Mode00_LeetCode.class03_哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/4/10
 * @description: map 集合分组统计
 */
public class code03_四数相加 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        // 遍历求 a+b 的和的集合
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int temp = nums1[i] + nums2[j];
                sumMap.put(temp, sumMap.getOrDefault(temp, 0) + 1);
            }
        }
        // 判断 0-(c + d) 是否在集合中
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int value = -nums3[i] - nums4[j];
                if (sumMap.containsKey(value)) {
                    count += sumMap.get(value);
                }
            }
        }
        return count;
    }
}