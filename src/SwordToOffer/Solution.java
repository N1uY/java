package SwordToOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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
    public int missingNumber(int[] nums) {
            if(nums.length==0){
                return 0;
            }
            int[] map = new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                map[nums[i]]++;
            }
            for(int i=0;i<map.length;i++){
                if(map[i]==0){
                    return i;
                }
            }
            return  nums.length+1;
    }
}
