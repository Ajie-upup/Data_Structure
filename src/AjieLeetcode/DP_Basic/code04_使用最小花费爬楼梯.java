package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code04_使用最小花费爬楼梯 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int min = minCostClimbingStairs(cost);
        System.out.println(min);
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n <= 1) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
