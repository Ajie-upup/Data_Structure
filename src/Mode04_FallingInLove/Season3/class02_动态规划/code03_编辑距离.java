package Mode04_FallingInLove.Season3.class02_动态规划;

/**
 * @author ajie
 * @date 2023/4/22
 * @description:
 */
public class code03_编辑距离 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n == 0 || m == 0) {
            return m + n;
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int left = dp[i][j - 1] + 1;
                int top = dp[i - 1][j] + 1;
                int left_top = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_top++;
                }
                dp[i][j] = Math.min(left, Math.min(top, left_top));
            }
        }
        return dp[n][m];
    }
}
