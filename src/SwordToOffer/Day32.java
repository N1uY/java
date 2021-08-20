package SwordToOffer;

public class Day32 {
    public String reverseLeftWords(String s, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        int start = n;
        for(int i = start;i<s.length();i++){
            stringBuffer.append(s.charAt(i));
        }
        for(int j=0;j<n;j++){
            stringBuffer.append(s.charAt(j));
        }
        return stringBuffer.toString();
    }
}
