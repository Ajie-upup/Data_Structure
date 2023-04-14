package Mode05_AcWing.class05_动态规划.class01_背包问题;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code02_完全背包问题 {
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
            for (int j = v[i]; j <= m; j++) {
                pack[j] = Math.max(pack[j], pack[j - v[i]] + w[i]);
            }
        }
        System.out.println(pack[m]);
    }
}
