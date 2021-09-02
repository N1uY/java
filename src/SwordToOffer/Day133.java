package SwordToOffer;

import java.util.*;

public class Day133 {
//    public String reverseWords(String s) {   这个解法有点垃圾写的
//        if(s.length()==0){
//            return "";
//        }
//        Stack<StringBuilder> strings = new Stack<>();
//        int i=0;
//        int j=i+1;
//
//        char[] chars = s.toCharArray();
//        //delete the space in the start;
//        while (i<chars.length&&chars[i]==' '){
//            i++;
//        }
//        if(i==chars.length){
//            return "";
//        }
//        j=i;
//        while (j<chars.length){
//            if(chars[j]!=' '&&j!=chars.length-1){
//                j++;
//            }
//            else if(j==chars.length-1){
//                StringBuilder stringBuilder = new StringBuilder();
//                for(int k=i;k<=j;k++){
//                    if(chars[k]!=' ') {
//                        stringBuilder.append(chars[k]);
//                    }
//                }
//                strings.add((stringBuilder));
//                j++;
//            }
//            else
//            {
//                StringBuilder stringBuilder = new StringBuilder();
//                for(int k=i;k<j;k++){
//                    stringBuilder.append(chars[k]);
//                }
//                strings.add((stringBuilder));
//                i=j+1;
//                while (i<chars.length&&chars[i]==' '){
//                    i++;
//                }
//                j=i+1;
//            }
//        }
//        StringBuilder rel = new StringBuilder();
//        while (!strings.empty()){
//            StringBuilder tmp = strings.pop();
//            rel.append(tmp);
//            rel.append(" ");
//        }
//        int length = rel.length();
//        return rel.toString().substring(0,length-1);
//    }
public String reverseWords(String s) {
    s = s.trim();
    ArrayList<String> strings = new ArrayList<>();
    int i=0;
    int j=i;
    while (j<s.length()){
        while (j<s.length()&&s.charAt(j)!=' '){
            j++;
        }
        strings.add(s.substring(i,j));
        i=j;
        while (i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        j=i;
    }
    Collections.reverse(strings);
    StringBuilder rel = new StringBuilder();
    for (String string : strings) {
        rel.append(string);
        rel.append(" ");
    }
    return  rel.toString().trim();
}
    public static void main(String[] args) {
        Day133 day133  = new Day133();
        String s = day133.reverseWords("1");
        System.out.println(s);
    }
}
