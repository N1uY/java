package Lc;

import java.util.ArrayList;
import java.util.List;

public class Lc78 {
    //好烦啊又是DFS
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    void dfs(int root,int[] nums) {
        if (root <=nums.length-1) {
            if (root == nums.length-1) {
                result.add(new ArrayList<>(path));
            }
            dfs(root+1,nums);
            path.add(nums[root]);
            if (root == nums.length-1) {
                result.add(new ArrayList<>(path));
            }
            dfs(root+1,nums);
            path.remove(path.size() - 1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return result;
    }
}
