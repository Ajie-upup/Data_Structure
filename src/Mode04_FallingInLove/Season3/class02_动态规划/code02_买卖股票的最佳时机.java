package Mode04_FallingInLove.Season3.class02_动态规划;

/**
 * @author ajie
 * @date 2023/4/22
 * @description: https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 */
public class code02_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        return 0;
    }


    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i - 1]);
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
