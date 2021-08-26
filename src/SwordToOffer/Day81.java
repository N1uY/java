package SwordToOffer;

public class Day81 {
    public int fib(int n) {
        int[] dp = new int[101];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
