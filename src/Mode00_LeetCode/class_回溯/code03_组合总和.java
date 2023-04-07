package Mode00_LeetCode.class_回溯;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code03_组合总和 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();

        dfs(candidates, 0, target, res, path);

        return res;
    }

    private void dfs(int[] candidates, int begin, int target, List<List<Integer>> res, Deque<Integer> path) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
        }

        for (int i = begin; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, target - candidates[i], res, path);
            path.removeLast();
        }
    }
}
