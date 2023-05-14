package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/14
 * @description:
 */
public class code08_最小路径和 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {1, 4, 1}, {1, 5, 1}};
        int res = minPathSum(arr);
        System.out.println(res);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
            }
        }
        return dp[n - 1];
    }
}
