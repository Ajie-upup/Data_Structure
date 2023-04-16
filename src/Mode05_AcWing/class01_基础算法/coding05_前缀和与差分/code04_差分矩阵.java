package Mode05_AcWing.class01_基础算法.coding05_前缀和与差分;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code04_差分矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] nums = new int[n + 1][m + 1];
        // 防止数组访问越界
        int[][] b = new int[n + 2][m + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                insert(b, i, j, i, j, nums[i][j]);
            }
        }
        while (q-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int c = sc.nextInt();
            insert(b, x1, y1, x2, y2, c);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                b[i][j] += b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void insert(int[][] b, int x1, int y1, int x2, int y2, int c) {
        b[x1][y1] += c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }
}
