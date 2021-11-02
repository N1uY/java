package Lc;

public class Lc11 {
    public int maxArea(int[] height) {
        int[] dp = new int[height.length];
        dp[0] = 0;
        if(height[0]<height[1]){
            dp[1] = height[0];
        }
        else
        {
            dp[1] = height[1];
        }

        for(int i=2;i<height.length;i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (height[j] < height[i]) {
                    int tmp = height[j] * (i - j);
                    if (tmp > max) {
                        max = tmp;
                    }
                } else {
                    int area = height[i] * (i- j);
                    if (area > max) {
                        max = area;
                    }
                    break;
                }
            }
            if (max > dp[i-1]) {
                dp[i] = max;
            } else{
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
