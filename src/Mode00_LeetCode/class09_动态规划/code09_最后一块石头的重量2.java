package Mode00_LeetCode.class09_动态规划;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code09_最后一块石头的重量2 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum >> 1;
        int[] dp = new int[target + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                // 分为放第 i 块石头和不放第 i 块石头两种情况
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[target];
    }
}
