package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/14
 * @description:
 */
public class code008_买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }
}
