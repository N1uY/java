package Lc;

public class Hot32 {
    //dp[i][j]=dp[i+2][j]&&s[i][i+1]=="()"||dp[i][j-2]&&s[j-1][j]=="()"||dp[i+1][j-1]&&s[i]=='(&&s[j]==')'   ()  ()
    public int longestValidParentheses(String s) {
        int length=s.length();
        boolean[][] dp = new boolean[length][length];
        //初始化长度为2的字串 dp
        for (int i = 0; i < length - 1; i++) {
            if(s.charAt(i)=='('&&s.charAt(i+1)==')'){
                dp[i][i+1]=true;
            }
        }
        for (int L = 3; L <= length; L++) {
            for (int i = 0; i <= length - L; i++) {
                int j=L+i-1;
                if(s.charAt(i)=='('&&s.charAt(j)==')'){
                    if(s.charAt(i+1)==')')i++;
                    if(s.charAt(j-1)=='(')j--;


                }
            }
        }
        int maxLength=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(dp[i][j]&&j-i+1>maxLength){
                    maxLength=j-i+1;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s=")(((((()())()()))()(()))(";
        System.out.println(s.length());
        Hot32 solution=new Hot32();
        int rel=solution.longestValidParentheses(")()())");

    }
}
