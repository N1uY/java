package Lc;

import java.util.ArrayList;
import java.util.HashMap;

public class Lc12 {
    private HashMap<Integer,String> hashMap = new HashMap<>();
    private String[] romasten = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    private String[] romashundred ={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private String[] romasthousand = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    private String[] romas4thousand ={"M","MM","MMM"};
    public void  setHashMap(){
        for(int i=1;i<=9;i++){
            hashMap.put(i,romasten[i-1]);
        }
        for(int i=10;i<=90;i+=10){
            hashMap.put(i,romashundred[i/10-1]);
        }
        for(int i=100;i<=900;i+=100){
            hashMap.put(i,romasthousand[i/100-1]);
        }
        for(int i=1000;i<=3000;i+=1000){
            hashMap.put(i,romas4thousand[i/1000-1]);
        }
        hashMap.put(0,"");
    }
    public String convert(int digit){
        return hashMap.get(digit);
    }
    public String intToRoman(int num) {
        setHashMap();
        StringBuilder result = new StringBuilder();
        ArrayList digits = new ArrayList();
        int weight=1;
        while(num>0){
            digits.add(num%10);
            num/=10;
            weight *=10;
        }
        weight /= 10;
        for(int i=digits.size()-1;i>=0;i--){
            // System.out.println(convert((int) digits.get(i)*weight));
            result.append(convert((int) digits.get(i)*weight));
            weight /= 10;
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Lc12 solution = new Lc12();
        String out = solution.intToRoman(3);
        System.out.println(solution.hashMap.get(30));
    }
}
