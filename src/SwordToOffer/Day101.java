package SwordToOffer;

public class Day101 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int[] dp = new  int[chars.length];
        if(chars.length==1){
            return 1;
        }
        dp[0] = 1;
        if(chars[0]=='1'||(chars[0]=='2'&&chars[1]>='0'&&chars[1]<='5')){
            dp[1] = 2;
        }
        else{
            dp[1]=1;
        }
        for(int i=2;i<dp.length;i++){
            if(chars[i-1]=='1'||(chars[i-1]=='2'&&chars[i]>='0'&&chars[i]<='5')){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
