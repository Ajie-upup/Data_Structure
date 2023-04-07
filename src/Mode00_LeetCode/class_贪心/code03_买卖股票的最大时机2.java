package Mode00_LeetCode.class_贪心;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code03_买卖股票的最大时机2 {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += (prices[i] - prices[i - 1]);
            }
        }
        return total;
    }
}
