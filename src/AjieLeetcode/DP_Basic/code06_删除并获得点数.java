package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code06_删除并获得点数 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] sum = new int[max + 1];
        for (int num : nums) {
            sum[num] += num;
        }

        return dp(sum);
    }

    private int dp(int[] sum) {
        int n = sum.length;
        int[] dp = new int[n];
        dp[0] = sum[0];
        dp[1] = Math.max(sum[0], sum[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i - 1]);
        }
        return dp[n - 1];
    }
}
