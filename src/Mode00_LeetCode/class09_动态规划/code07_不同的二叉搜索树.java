package Mode00_LeetCode.class09_动态规划;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code07_不同的二叉搜索树 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // 以 j 为首节点的二叉树的个数
                // j - 1 表示左边子节点的个数
                // i - j 表示右边子节点的个数
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
