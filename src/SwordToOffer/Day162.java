package SwordToOffer;

import java.util.Arrays;

public class Day162 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int kingNumber=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                kingNumber++;
                continue;
            }
            else

            {
                if(nums[i]==nums[i+1]){
                    return false;
                }
                if(nums[i+1]-nums[i]==1){
                    continue;
                }
                if(nums[i+1]-nums[i]-1>kingNumber){
                    return false;
                }
                else
                {
                    kingNumber -=(nums[i+1]-nums[i]);
                    continue;
                }
            }
        }
        return true;
    }
}
