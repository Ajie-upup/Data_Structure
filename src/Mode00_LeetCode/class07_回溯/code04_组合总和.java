package Mode00_LeetCode.class07_回溯;

import java.util.*;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code04_组合总和 {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new ArrayDeque<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        if (target < candidates[0]) {
            return res;
        }
        backTracking(candidates, target, 0);
        return res;
    }

    private void backTracking(int[] candidates, int target, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int index = begin; index < candidates.length; index++) {
            path.addLast(candidates[index]);
            backTracking(candidates, target - candidates[index], index);
            path.removeLast();
        }
    }
}
