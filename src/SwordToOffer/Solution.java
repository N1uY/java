package SwordToOffer;

public class Solution {
    public int maxProfit(int[] prices) {
          int[] dp = new int[prices.length];
          dp[0] = 0;
          for(int i=1;i< dp.length;i++)
          {
              int tmpmin = Integer.MIN_VALUE;
              for(int j=i;j>=0;j--){
                  int profit = prices[i]-prices[j];
                  if(profit>tmpmin)
                  {
                      tmpmin = profit;
                  }
          }
              dp[i] = Math.max(dp[i - 1], tmpmin);
          }
          return  dp[prices.length-1];
    }
}
