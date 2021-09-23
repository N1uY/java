package SwordToOffer;

public class Day212 {
    public int add(int a, int b) {
            return helper(a,b);
    }
    public int helper(int a,int b){
        if((a&b)==0){
            return a^b;
        }
        else{
            return helper(a^b,a&b);
        }
    }

}
