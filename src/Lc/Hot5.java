package Lc;

import java.util.HashMap;

public class Hot5 {

    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
        }
        //将对角线以下设置为false
        // for(int falseIndex=0;falseIndex<dp[0].length-1;falseIndex++){
        //     for(int falseRow=falseIndex+1;falseRow<dp.length;falseRow++){
        //         dp[falseRow][falseIndex]=false;
        //     }
        // }
        for(int L=2;L<=s.length();L++){
            for(int i=0;i<=s.length()-L;i++){
                int j=L+i-1;
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }
                else
                {
                    if(L==2){
                        dp[i][j]=true;
                    }
                    else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
            }
        }
        int Maxlenth=-1;
        int start=-1;
        int end=-1;
        for (int i = 0; i < dp.length; i++) {
            for(int j=0;j<dp[0].length;j++){
                if (dp[i][j]) {
                    if (j - i+1 >= Maxlenth) {
                        Maxlenth=j-i+1;
                        end=j;
                        start=i;
                    }
                }
            }
        }

        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        Hot5 solution =  new Hot5();
        String s = solution.longestPalindrome("bb");
        System.out.println(s);
    }

}
