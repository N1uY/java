package SwordToOffer;

import java.util.ArrayList;

public class Day132 {
    static  int[] twoSum(int[] nums, int target) {
            if(nums.length==0){
                return nums;
            }
            int[] result = new int[2];
            boolean flag = false;
            int i=0;
            int j=nums.length-1;
            while (i <= j) {
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                flag = true;
                result[0] = nums[i];
                result[1] = nums[j];
                break;
            }

        }
        if(flag){
            return result;
        }
        else{
            int[] rel = {};
            return rel;
        }
    }

    public static void main(String[] args) {
        int[] n = {2,7,11,15};
        int t = 9;
        twoSum(n,t);
    }
}
