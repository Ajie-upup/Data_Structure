package Mode04_FallingInLove.Season3.class02_动态规划;

/**
 * @author ajie
 * @date 2023/4/22
 * @description: https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/description/
 */
public class code01_礼物的最大值 {
    public int maxValue(int[][] grid) {
        int n = grid[0].length;
        int[] dp = new int[n];

        for (int i = 0; i < grid.length; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.max(dp[j - 1] + grid[i][j], dp[j] + grid[i][j]);
            }
        }
        return dp[n - 1];
    }
}
