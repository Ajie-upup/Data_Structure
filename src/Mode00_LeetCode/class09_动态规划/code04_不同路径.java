package Mode00_LeetCode.class09_动态规划;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code04_不同路径 {
    public int uniquePaths(int m, int n) {
        int[] paths = new int[n];
        Arrays.fill(paths, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[j] += paths[j - 1];
            }
        }
        return paths[n - 1];
    }
}
