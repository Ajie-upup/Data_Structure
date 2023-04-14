package Mode05_AcWing.class05_动态规划.class01_背包问题;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code01_背包问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int[] pack = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--) {
                pack[j] = Math.max(pack[j], pack[j - v[i]] + w[i]);
            }
        }
        System.out.println(pack[m]);
    }

    public void method1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int[][] pack = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pack[i][j] = pack[i - 1][j];
                if (j >= v[i]) {
                    pack[i][j] = Math.max(pack[i][j], pack[i - 1][j - v[i]] + w[i]);
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= m; i++) {
            res = Math.max(res, pack[n][i]);
        }
        System.out.println(res);
    }
}
