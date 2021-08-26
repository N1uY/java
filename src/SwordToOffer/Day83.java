package SwordToOffer;

public class Day83 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        if(prices.length==0)
        {
            return 0;
        }
        int[] dp = new int[100001];
        dp[0] = 0;
        for(int i=0;i<prices.length;i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (i != 0) {
                dp[i] = Math.max(prices[i] - minPrice, dp[i - 1]);
            }
        }
        return dp[prices.length-1];
    }

}
