package Mode00_LeetCode.class09_动态规划;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code06_整数拆分 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
