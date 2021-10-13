package SwordToOffer;

import java.util.Arrays;

public class Day222 {
    public int singleNumber(int[] nums) {
            int[] counts = new int[32];
            for(int num:nums){
                int log = 1;
                for(int i=0;i<32;i++){
                    if((num&log)!=0)
                    {
                    counts[i] ++;
                    }
                    log <<= 1;

                }
            }
            System.out.println(Arrays.toString(counts));
            for(int j=0;j<counts.length;j++){
                counts[j] %=3;
            }
            int rel = 0 ;
            int di = 2;
            for(int j=0;j<counts.length;j++) {
                rel <<=1;
                rel |=counts[31-j];
//                rel += counts[j]*Math.pow(2,j);
            }
            System.out.println(Arrays.toString(counts));

            return  rel;
    }

    public static void main(String[] args) {
        Day222 day = new Day222();
        int[] test={1,1,6,1};
        int b= day.singleNumber(test);
        System.out.println(b);
//        int rel = 0x0;
//        rel <<=1;
//        System.out.println(rel);

    }
}
