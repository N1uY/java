package SwordToOffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//dfs记录路径一定要记得退出遍历过子节点的节点
public class Day151 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
            List<List<Integer>> rel = new LinkedList<>();
            List<Integer> path  = new LinkedList<>();
            dfs(root,target,path,rel);
           return  rel;


    }
    static void  dfs(TreeNode p,int target,List<Integer> path,List<List<Integer>> result) {
        if (p != null) {


            path.add(p.val);
            if (p.val == target && p.left == null && p.right == null) {
                result.add(new LinkedList<>(path));
            }
            target = target - p.val;

            dfs(p.left, target, path, result);
            dfs(p.right, target, path, result);
            path.remove(path.size() - 1);
        }


    }



}
