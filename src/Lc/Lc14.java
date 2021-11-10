package Lc;

public class Lc14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int minlength = 250;
        int index = 0;
        if(strs.length==1){
            return strs[0];
        }
        for (String str : strs) {
            if (str.length() < minlength) {
                minlength = str.length();
            }
        }
        while (index<minlength) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(index) == strs[i + 1].charAt(index)) {
                    if (i == strs.length - 2) {
                        stringBuilder.append(strs[i].charAt(index));
                        index++;
                    }
                } else {
                    return stringBuilder.toString();
                }
            }

        }
        return stringBuilder.toString();
    }
}
