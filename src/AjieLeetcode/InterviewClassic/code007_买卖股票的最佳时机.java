package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code007_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i - 1], min);
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
