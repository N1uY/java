package SwordToOffer;

public class Day91 {
    static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i=1;i<dp.length;i++){
            int rel = Math.max(dp[i-1]+nums[i],nums[i] );
            dp[i] = rel;
        }
        int max = dp[0];
        for(int i =0;i<dp.length;i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] t = {-2,1};
       int a= maxSubArray(t);
    }
}
