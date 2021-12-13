package Lc;

import java.util.Arrays;

public class Lc1005 {
    public int Sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k > 0) {
            Arrays.sort(nums);
            if (k % 2 == 0) {
                return Sum(nums);
            }
            else {
                nums[0] = -nums[0];
                return Sum(nums);
            }
        }
        else
        {
            return Sum(nums);
        }
    }


}
