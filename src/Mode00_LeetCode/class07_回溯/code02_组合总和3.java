package Mode00_LeetCode.class07_回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code02_组合总和3 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return res;
    }

    private void backTracking(int k, int target, int cur, int sum) {
        // 递归终止条件
        if (path.size() == k) {
            // 符合要求的条件
            if (sum == target) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        // 剪枝去重操作
        if (path.size() > k || cur > 9 || sum > target) {
            return;
        }

        path.add(cur);
        sum += cur;
        backTracking(k, target, cur + 1, sum);

        // 回溯
        path.remove(path.size() - 1);
        sum -= cur;
        backTracking(k, target, cur + 1, sum);
    }
}
