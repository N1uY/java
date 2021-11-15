package Lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lc22 {
    private ArrayList< LinkedList<String>> dp = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

            LinkedList<String> r = new LinkedList<>();
            r.add("");
            dp.add(r);
            LinkedList<String> rel =    new LinkedList<String>();
            rel.add("()");
            dp.add(rel);
            for(int k=2;k<=n;k++){
                LinkedList<String> forK =  new LinkedList<>();
                for(int i=0;i<k;i++){
                    int outerNumber = k-1-i;
                    for(int j=0;j<dp.get(i).size();j++){
                        for(int l=0;l<dp.get(outerNumber).size();l++){
                            String tmp = "("+dp.get(i).get(j)+")"+dp.get(outerNumber).get(l);
                            forK.add(tmp);
                        }
                    }
                }
                dp.add(forK);
            }
            return dp.get(n);
    }

    public static void main(String[] args) {
        Lc22 solution = new Lc22();
        List<String> generate = solution.generateParenthesis(3);
        System.out.println(generate);
    }
}
