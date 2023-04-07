package Mode03_BlueBridgeCup.topic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/22
 * @description:
 */
public class code01_作物杂交 {
    static int n, m, k, t;
    //种植时间、初始作物种类、杂交所需的时间、植物是否已经合成、记录各类物种合成所需的最短时间
    static int[] time, staSeed, maxTime, visited, res;
    static int[][] hyb;//杂交途径

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //第一行数目
        n = scan.nextInt();//作物种类
        m = scan.nextInt();//初始作物种类
        k = scan.nextInt();//杂交途径
        t = scan.nextInt();//目标种子
        res = new int[n + 1];
        time = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            time[i] = scan.nextInt();
        }
        staSeed = new int[m];//初始作物种类
        maxTime = new int[k];
        visited = new int[n + 1];
        for (int i = 0; i < m; i++) {
            staSeed[i] = scan.nextInt();
            visited[staSeed[i]] = 1;//记录初始作物已合成
        }
        hyb = new int[k][3];
        for (int i = 0; i < k; i++) {
            hyb[i][0] = scan.nextInt();
            hyb[i][1] = scan.nextInt();
            hyb[i][2] = scan.nextInt();
            maxTime[i] = Math.max(time[hyb[i][0]], time[hyb[i][1]]);
        }

        System.out.println(dfs(t));
    }

    public static int dfs(int tar) {//kx：
        if (visited[tar] == 0) {//未合成
            int min = Integer.MAX_VALUE;
            //遍历杂交hyb
            for (int i = 0; i < k; i++) {
                if (hyb[i][2] == tar) {
                    min = Math.min(min, (maxTime[i] + Math.max(dfs(hyb[i][0]), dfs(hyb[i][1]))));
                }
            }
            visited[tar] = 1;
            res[tar] = min;
            return min;
        } else {
            return res[tar];
        }
    }
}

