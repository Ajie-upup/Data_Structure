package Mode00_LeetCode.class09_动态规划;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code02_爬楼梯 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
