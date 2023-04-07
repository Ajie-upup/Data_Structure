package Mode03_BlueBridgeCup.code2022;


import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code07_数组切分 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int r = 1; r < n + 1; r++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int l = r; l > 0; l--) {
                max = Math.max(max, arr[l]);
                min = Math.min(min, arr[l]);
                if (max - min == r - l) {
                    dp[r] = (dp[r] + dp[l - 1]) % 1000000007;
                }
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
