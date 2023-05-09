package Mode05_AcWing.class03_搜索与图论;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/27
 * @description:
 */
public class code02_n皇后问题 {
    static int n;
    static char[][] result;
    static boolean[] col;  // 每一列是否放置过
    static boolean[] dg; // 对角线截距
    static boolean[] udg;  // 反对角线截距

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
        result = new char[n][n];
        col = new boolean[n];
        dg = new boolean[2 * n];
        udg = new boolean[2 * n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = '.';

        dfs(0);
    }

    public static void dfs(int x) {
        // x 表示递归的行号
        if (x == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(result[i][j]);
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int y = 0; y < n; y++) {
            // 判断该行的列，对角线，反对角线上是否有皇后
            if (!col[y] && !dg[y - x + n] && !udg[y + x]) {
                result[x][y] = 'Q';
                col[y] = dg[y - x + n] = udg[y + x] = true;
                dfs(x + 1);
                col[y] = dg[y - x + n] = udg[y + x] = false;
                result[x][y] = '.';
            }
        }
    }
}
