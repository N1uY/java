package SwordToOffer;

import java.util.HashMap;

public class Day41 {
    //位运算  hash
    public int findRepeatNumber(int[] nums) {
        int[] hash = new int[nums.length];   //初始化值默认0
        for (int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int j=0;j<hash.length;j++){
            if(hash[j]>1)
            {
                return j;
            }
        }
        return  0;
    }
}
