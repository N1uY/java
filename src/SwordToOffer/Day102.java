package SwordToOffer;

import java.util.HashSet;

public class Day102 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (set.add(chars[i])) {
                dp[i] = dp[i - 1] + 1;
            } else {
                set.clear();
                set.add(chars[i]);
                dp[i] = 1;
                for(int j=i-1;j>0;j--){
                    if(chars[j]!=chars[i]){
                        dp[i]++;
                        set.add(chars[j]);
                    }
                    else{
                        break;
                    }
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }

        }
        return max;
    }
//使用滑动窗口法解决该问题，该法也可以返回最长字串
   static public int lengthOfLongestSubstringFlipp(String s) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abccd";
        System.out.println(lengthOfLongestSubstringFlipp(s));
    }
}
