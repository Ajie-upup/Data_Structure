package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/14
 * @description:
 */
public class code11_下降路径最小和 {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int next;
                int pre = next = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    pre = matrix[i][j - 1];
                }
                if (j + 1 < n){
                    next = matrix[i][j+1];
                }
                dp[j] = matrix[i-1][j];
            }
        }
        return dp[n - 1];
    }
}
