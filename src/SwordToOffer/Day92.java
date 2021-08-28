package SwordToOffer;

public class Day92 {
    public int maxValue(int[][] grid) {
            int length = grid.length;
            int width = grid[0].length;
            if(length==0||width==0){
            return 0;
            }
            int[][] dp = new int[length][width];
            dp[0][0] = grid[0][0];
            for(int j=1;j<width;j++){
                dp[0][j]=dp[0][j-1]+grid[0][j];
            }
            for(int i=1;i<length;i++){
                dp[i][0] = dp[i-1][0]+grid[i][0];
            }
            for(int i=1;i<length;i++){
                for(int j=1;j<width;j++){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
            }
            return dp[length-1][width-1];
    }
}
