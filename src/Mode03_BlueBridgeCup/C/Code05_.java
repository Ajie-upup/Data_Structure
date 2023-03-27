package Mode03_BlueBridgeCup.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/21
 * @description:
 */
public class Code05_ {
    /*
        向左下走的次数与向右下走的次数相差不能超过 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[105][105];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] += Math.max(a[i - 1][j - 1], a[i - 1][j]);
            }
        }
        //需要满足向左下走的次数与向右下走的次数相差不能超过1
//        int ans=a[n][1];
//        for(int i=2;i<=n;i++){
//            if(a[n][i]>ans)
//                ans=a[n][i];
//        }
        //答案只会出现中间的两位数
        int ans = Math.max(a[n][(n + 1) / 2], a[n][(n + 2) / 2]);
        System.out.println(ans);
    }
}
