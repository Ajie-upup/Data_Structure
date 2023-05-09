package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code03_第N个泰波那契数 {
    public static void main(String[] args) {
        int nums = tribonacci(4);
        System.out.println(nums);
    }
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
