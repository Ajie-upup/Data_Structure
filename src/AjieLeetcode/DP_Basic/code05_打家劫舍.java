package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code05_打家劫舍 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[n];
    }
}
