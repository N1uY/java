package SwordToOffer;

public class Day31 {
    //shame of you
    public String replaceSpace(String s) {
        String rel;
        rel = s.replace(" ","%20");
        return  rel;

    }
    //normal
    public String replaceSpace1(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {
                stringBuffer.append("%20");
            }
            else
            {
                stringBuffer.append(s.charAt(i));
            }
        }
        return  stringBuffer.toString();

    }
}
