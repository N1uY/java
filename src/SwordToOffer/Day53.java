package SwordToOffer;

import java.util.HashMap;

public class Day53 {
    static char firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(hashMap.get(s.charAt(i))==1)
            {
                return  s.charAt(i);
            }
        }
        System.out.println(hashMap);
        return ' ';
    }

    public static void main(String[] args) {
        String test = "dddccdbba";
        String test2 = "aabbcc";
        char a =firstUniqChar(test);
        char b = firstUniqChar(test2);
    }
}
