package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code01_爬楼梯 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
