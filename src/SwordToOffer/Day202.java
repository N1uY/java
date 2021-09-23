package SwordToOffer;

public class Day202 {
    public double myPow(double x, int n) {
        if(n>=0){
            return helper(x,n);
        }
        else
        {

            return 1/helper(x,-n);
        }
    }
    double helper(double x,int n){
        if(n==0){
            return 1.0;
        }
        else{
            if(n%2==0)
            {
                double tmp =  myPow(x,n/2);
                return tmp*tmp;
            }
            else {
                return x * myPow(x, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MIN_VALUE;

        Day202 day202 = new Day202();
        double s = day202.myPow(2,i);
        System.out.println(s);
        System.out.println(i);
        System.out.println(j);

    }
}
