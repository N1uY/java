package Lc;

public class Lc08 {
    public int myAtoi(String s) {
            s = s.trim();
            char start = s.charAt(0);
            if( start!='+' && start!='-' && (start>'9'||start<'0')){
                return 0;
        }
            boolean negative = false;
            int index = 0;

            if(start=='-'){
                negative = true;
                index++;
            }
            else if(start=='+') {
                index++;
            }
            int result = 0;
            for(int i=index;i<s.length();i++){
                if(s.charAt(i)>'9'||s.charAt(i)<'0'){
                    break;
                }
                else {
                    if ((result < Integer.MAX_VALUE / 10 && !negative) || (result < -(Integer.MIN_VALUE / 10) && negative))
                    {result = result * 10 + s.charAt(i) - '0';}
                    else if (result == -(Integer.MIN_VALUE / 10)) {
                        if(negative){
                            if (s.charAt(i)<'8'){
                                result = result * 10 + s.charAt(i) - '0';
                            }
                            else
                            {
                                result = Integer.MIN_VALUE;
                                return  result;
                            }
                        }
                        else
                        {
                            if(s.charAt(i)<'7'){
                                result = result * 10 + s.charAt(i) - '0';
                            }
                            else
                            {
                                result = Integer.MAX_VALUE;
                                return  result;
                            }
                        }
                    } else {
                        if (!negative) {
                            result = Integer.MAX_VALUE;
                        } else {
                            result = Integer.MIN_VALUE;
                        }
                        return  result;

                    }

                }
            }
            if(negative) {
                    return -result;

            }
            else
            {
                return result;

            }
    }

    public static void main(String[] args) {

        Lc08 solution = new Lc08();
        System.out.println(solution.myAtoi("-91283472332"));
        //        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
    }
}
