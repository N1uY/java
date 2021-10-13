package Lc;

public class Lc01 {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int[] rel = new int[2];
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]+nums[j]==target){
                    rel[0] = i;
                    rel[1] = j;
                }
            }
        }
        return rel;
    }
}
