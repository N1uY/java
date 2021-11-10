package Lc;

import java.util.LinkedList;
import java.util.List;

public class Hot17 {
    private char[][] tel = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'},};
    StringBuffer dfsString =  new StringBuffer();
    private List<String> rel = new LinkedList<>();
    int[] path;
    public void   dfs(int deep){
        int depth = path.length;
        if (deep<depth){
            for(int j=0;j<tel[path[deep]].length;j++){
                dfsString.append(tel[path[deep]][j]);
                if(deep==depth-1){
                    rel.add(dfsString.toString());
                }
                dfs(deep+1);
                dfsString.deleteCharAt(dfsString.length()-1);
            }

        }

    }
    public List<String> letterCombinations(String digits) {

        int[] sequence = new int[digits.length()];
        for(int i=0;i<digits.length();i++){
            sequence[i] = digits.charAt(i)-'2';
        }
        this.path = sequence;
        for(int number:path){
            System.out.println(number);
        }
        dfs(0);
        return rel;
    }

    public static void main(String[] args) {
        String d = "23";
        Hot17 solution = new Hot17();
        List<String> p;
        p = solution.letterCombinations(d);
        System.out.println(p);
    }
}
