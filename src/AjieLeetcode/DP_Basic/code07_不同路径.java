package AjieLeetcode.DP_Basic;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/5/14
 * @description:
 */
public class code07_不同路径 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
