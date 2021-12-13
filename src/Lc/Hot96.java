package Lc;

public class Hot96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];   //这里dp代表的是n个连续数字所能构成的二叉搜索树种数
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n+1; i++) {
            int sum = 0;
            for (int leftNumber = 0; leftNumber < i; leftNumber++) {
                sum += dp[leftNumber] * dp[i - 1 - leftNumber];
            }
            dp[i] = sum;
        }
        return dp[n];
    }

    public static void main(String[] args) {
    }
}
