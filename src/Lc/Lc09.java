package Lc;

public class Lc09 {
    public boolean isPalindrome(int x) {
            int[] digits = new int[14];
            if(x==Integer.MIN_VALUE){
                return  false;
            }
            if(x<0){
                return false;
            }
            if(x==0){
                return  true;
            }
            int index = 0;
            while (x>0){
                digits[index] = x%10;
                x/=10;
                index++;
            }
            index--;
            int start = 0;
            while (start<index){
                if(digits[start]!=digits[index]){
                    return  false;
                }
                start++;
                index--;
            }
            return true;
     }
}
