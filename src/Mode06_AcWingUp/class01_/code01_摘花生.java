package Mode06_AcWingUp.class01_;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/27
 * @description:
 */
public class code01_摘花生 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            // 处理输入
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] site = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    site[i][j] = sc.nextInt();
                }
            }
            int[] dp = new int[y];
            for (int i = 0; i < x; i++) {
                dp[0] += site[i][0];
                for (int j = 1; j < y; j++) {
                    dp[j] = Math.max(dp[j], dp[j - 1]) + site[i][j];
                }
            }
            System.out.println(dp[y - 1]);
        }
    }
}
