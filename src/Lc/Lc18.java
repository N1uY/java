package Lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc18 {
    int[] numsAll;
    public ArrayList<ArrayList<Integer>> helper(int begin,int stop,int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (begin<stop){
            if (numsAll[begin] + numsAll[stop] > target) {
                stop--;
            } else if (numsAll[begin] + numsAll[stop] < target) {
                begin++;
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(numsAll[stop]);
                temp.add(numsAll[begin]);
                result.add(temp);
                while (numsAll[stop-1]==numsAll[stop]) stop--;
                while (numsAll[begin+1]==numsAll[begin]) begin++;
                stop--;
                begin++;
            }
        }
        return result;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }
        numsAll = nums;
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while (start < end) {
            int sum = nums[start]+nums[end];
            ArrayList<ArrayList<Integer>> middleResult = helper(start+1,end-1,target-sum);
            if (middleResult.size() != 0) {
                for (int i = 0; i < middleResult.size(); i++) {
                    middleResult.get(i).add(nums[start]);
                    middleResult.get(i).add(nums[end]);
                    result.add(middleResult.get(i));
                }
            }
            while (nums[start+1]==nums[start]) start++;
            while (nums[end-1]==nums[end]) end--;



        }
        return result;
    }

    public static void main(String[] args) {
        Lc18 solution = new Lc18();
        List<List<Integer>> r = solution.fourSum()
    }
}

