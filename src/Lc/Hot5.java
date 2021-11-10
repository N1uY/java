package Lc;

import java.util.HashMap;

public class Hot5 {

    public String longestPalindrome(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            StringBuilder Left = new StringBuilder();
            StringBuilder Right = new StringBuilder();
            int left = i;
            int right = i;
            while (left>=0&&right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    Left.append(s.charAt(left));
                    left--;
                    if(right!=i) {
                        Right.append(s.charAt(right));
                    }
                    right++;
                }
                else{
                    break;
                }
            }
            Left.reverse();
            String tmp = Left.toString()+Right.toString();
            if(tmp.length()>result.length()){
                result = tmp;
            }
        }
        return  result;
    }
}
