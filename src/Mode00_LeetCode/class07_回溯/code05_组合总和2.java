package Mode00_LeetCode.class07_回溯;

import java.util.*;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code05_组合总和2 {
    List<List<Integer>> res = new ArrayList<>();

    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0);
        return res;
    }

    private void backTracking(int[] candidates, int target, int begin) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
        }

        for (int index = begin; index < candidates.length; index++) {
            // 去重
            if (index > begin && candidates[index] == candidates[index - 1]) {
                continue;
            }
            path.addLast(candidates[index]);
            backTracking(candidates, target - candidates[index], index + 1);
            path.removeLast();
        }
    }
}
