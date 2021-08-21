package SwordToOffer;

public class Day43 {
    public int missingNumber(int[] nums) {
            int[] hash  = new int[nums.length];
            for (int i=0;i<nums.length;i++){
                if(nums[i]<nums.length)
                {hash[nums[i]]++;}
            }
            for(int i=0;i<hash.length;i++){
                if(hash[i]==0){
                    return i;
                }
            }
            return -1;
    }
    //这也能二分。。。。。。。。。。
    public int missingNumber2(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if(nums[mid]==mid){
                l = l+1;
            }
            else {
                r=mid;
            }

        }
        if(nums[nums.length-1]==nums.length-1)
        {
            return nums.length;
        }
        else{
            return  l;

        }
    }
}
