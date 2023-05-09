package AjieLeetcode.DP_Basic;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code02_斐波那契数列 {
    public int fib(int n) {
        if (n == 0){
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
