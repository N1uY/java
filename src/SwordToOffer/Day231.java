package SwordToOffer;

import java.util.Arrays;

public class Day231 {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int mid = (nums.length)/2;
//        return nums[mid];
//    }
    //mole votes method
    public  int majorityElement(int[] nums){
        int candidate = -1;
        int count = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
                count++;
            }
            else
            {
                if(num==candidate){
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }
        return  candidate;
    }
}
