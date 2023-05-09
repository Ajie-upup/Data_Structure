package Mode05_AcWing.class03_搜索与图论;

import java.util.Scanner;

public class code03_n皇后问题2 {
    static int n;
    static boolean[] row;
    static boolean[] col;
    static boolean[] dg;
    static boolean[] udg;
    static char[][] map;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
        row = new boolean[n];
        col = new boolean[n];
        dg = new boolean[2 * n];
        udg = new boolean[2 * n];
        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                map[i][j] = '.';
        }
        dfs(0, 0, 0); // 皇后的位置，数量
    }

    public static void dfs(int x, int y, int u) {
        if (y == n) { // 一行完
            y = 0;
            x++;
        }

        if (x == n) { // 行遍历完
            if (u == n) { // 摆完就输出
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        System.out.print(map[i][j]);
                    System.out.println();
                }
                System.out.println();
            }
            return; // 无论是否皇后都放好，都要退出
        }

        dfs(x, y + 1, u); // 当前不摆放

        if (!row[x] && !col[y] && !dg[n + y - x] && !udg[y + x]) { // 合法位置
            row[x] = col[y] = dg[n + y - x] = udg[y + x] = true;
            map[x][y] = 'Q';
            dfs(x, y + 1, u + 1);
            row[x] = col[y] = dg[n + y - x] = udg[y + x] = false;
            map[x][y] = '.';
        }
    }

}