package Lc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hot31 {
    public void nextPermutation(int[] nums) {
        int end = nums.length-1;
        boolean hasNext = false;
        while (end >= 0) {
            for (int j = end - 1; j >= 0; j--) {
                if(nums[j]<nums[end]){
                    int temp=nums[j];
                    nums[j]=nums[end];
                    nums[end]=temp;
                    hasNext=true;
                    break;
                }
            }
            end--;
        }
        if (!hasNext) {
            Arrays.sort(nums);
        }
    }

}
