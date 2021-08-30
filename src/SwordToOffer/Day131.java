package SwordToOffer;
//类似于快排
public class Day131 {
    public int[] exchange(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        int i=0;
        int j = nums.length-1;
        boolean flag = true;
        while (i<j){
            if(flag) {
                if (nums[i] % 2 == 0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    flag=false;
                } else {
                    i++;
                }
            }
            else {
                if (nums[j] % 2 == 1) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    flag=true;
                } else {
                    j--;
                }
            }
        }
        return nums;
    }
}
