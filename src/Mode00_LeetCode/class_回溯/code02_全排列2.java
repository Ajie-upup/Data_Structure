package Mode00_LeetCode.class_回溯;

import java.util.*;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code02_全排列2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        // 排序（升序或者降序都可以），排序是剪枝的前提
        Arrays.sort(nums);

        boolean[] used = new boolean[len];
        // 使用 Deque 是 Java 官方 Stack 类的建议
        Deque<Integer> list = new ArrayDeque<>(len);
        backtrace(nums, 0, used, list, res);
        return res;
    }

    private void backtrace(int[] nums, int count, boolean[] used, Deque<Integer> list, List<List<Integer>> res) {
        if (count == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (used[i]) {
                continue;
            }

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] --> used[i - 1] == false 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            list.addLast(nums[i]);
            used[i] = true;

            backtrace(nums, count + 1, used, list, res);
            // 回溯部分的代码，和之前的代码是对称的
            used[i] = false;
            list.removeLast();
        }
    }
}
