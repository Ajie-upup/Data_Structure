package Mode00_LeetCode.class_贪心;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code01_全排列 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();

        boolean[] used = new boolean[n];

        int count = 0;

        backtrace(list, used, count, nums);

        return res;
    }

    private void backtrace(List<Integer> list, boolean[] used, int count, int[] nums) {
        if (count == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                backtrace(list, used, count + 1, nums);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
