package Lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Hot15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rel = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length;i++){
            int left = i+1;
            int right = length-1;
            if(i>=1&&nums[i]==nums[i-1]){
                continue;
            }
            else
            {
                int target = -nums[i];
                while (left<right){
                    if(nums[left]+nums[right]>target){
                        right--;
                    }
                    else if(nums[left]+nums[right]<target){
                        left++;
                    }
                    else
                    {


                                List<Integer> tmp = new ArrayList<>();
                                tmp.add(nums[left]);
                                tmp.add(nums[right]);
                                tmp.add(nums[i]);
                                rel.add(tmp);

                        while (left<right && nums[left] == nums[left+1]) left++; // 去重
                        while (left<right && nums[right] == nums[right-1]) right--; // 去
                        left++;
                        right--;

                        }
                    }
                }
            }

        return rel;
    }

    public static void main(String[] args) {
        Hot15 solution  = new Hot15();
        int[] testCase = {-1,0,1,2,-1,-4};
        List<List<Integer>> r = solution.threeSum(testCase);
        System.out.println(r.toString());
    }
}
