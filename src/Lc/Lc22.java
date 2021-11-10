package Lc;

import java.util.HashSet;
import java.util.Set;

public class Lc22 {
    public Set<String> helper(int n){
        if(n==0){
            return new HashSet<>();
        }
        if(n==1)
        {
            Set<String> set = new HashSet<>();
            String s = "()";
            set.add(s);
            return set;

        }
        else {
            for(int i=0;i<n-1;i++){
                int j = n-1-i;
                String newString;

            }
        }

    }
    public List<String> generateParenthesis(int n) {

    }
}
