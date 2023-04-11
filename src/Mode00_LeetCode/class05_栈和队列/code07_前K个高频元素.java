package Mode00_LeetCode.class05_栈和队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code07_前K个高频元素 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // 维护一个小顶堆，只需要维护其中 k 个元素
        PriorityQueue<int[]> pq = new PriorityQueue<>((arr1, arr2) -> arr1[1] - arr2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (pq.size() < k) {
                // 当堆中元素小于 k 个时，直接将元素添加到堆中
                pq.add(new int[]{entry.getKey(), entry.getValue()});
            } else {
                // 当 entry 中的元素大于小顶堆的堆顶元素，进行poll操作
                if (entry.getValue() > pq.peek()[1]) {
                    pq.poll();
                    // 将新元素加入堆中，由堆自动维护
                    pq.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            // 优先弹出的元素出现次数较少，放在数组的末尾
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
