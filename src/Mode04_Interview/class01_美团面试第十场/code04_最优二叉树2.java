package Mode04_Interview.class01_美团面试第十场;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code04_最优二叉树2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[305];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //dp[i][j][k]代表，arr[i-j]中，以k为根的最优子结构
        int[][][] dp = new int[n][n][n];
        //初始化两个结点的情况
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1][i] = nums[i] * nums[i + 1];
            dp[i][i + 1][i + 1] = dp[i][i + 1][i];
        }
        //区间长度
        for (int k = 2; k < n; k++) {
            //最左
            for (int i = 0; i < n - k; i++) {
                //中间结点位置
                for (int m = i; m <= i + k; m++) {
                    //左边最小
                    int left = i == m ? 0 : dp[i][m - 1][i] + nums[i] * nums[m];
                    for (int l = i + 1; l < m; l++) {
                        left = Math.min(left, dp[i][m - 1][l] + nums[l] * nums[m]);
                    }
                    //右边最小
                    int right = m == i + k ? 0 : dp[m + 1][i + k][i + k] + nums[i + k] * nums[m];
                    for (int r = m + 1; r < i + k; r++) {
                        right = Math.min(right, dp[m + 1][i + k][r] + nums[r] * nums[m]);
                    }
                    //统计结果
                    dp[i][i + k][m] = left + right;
                }
            }
        }
        //遍历所有中间结点，取最大
        int res = dp[0][n - 1][0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, dp[0][n - 1][i]);
        }
        System.out.println(res);
    }

}
