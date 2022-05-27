package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-26 09:29
 * @Description leetcode 121、买卖股票的最佳时机
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int maxprofit = 0;
        int minprice = prices[0];
        for (int i = 1; i < len; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
