package Lc;

import java.util.HashMap;

public class Lc03 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxLength = 0;
        int start=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int end=0;
        while(end<s.length()){
            while(end<s.length() &&!hashMap.containsKey(s.charAt(end))){
                hashMap.put(s.charAt(end),end);
                if(end-start+1>maxLength){
                    maxLength = end-start+1;
                }
                end++;
            }
            start = hashMap.get(s.charAt(end))+1;
            hashMap.clear();
            end = start;
        }
        return maxLength;
    }
}
