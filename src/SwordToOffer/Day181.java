package SwordToOffer;

public class Day181 {
    int dept = 0;

    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return dept;
    }
    public void dfs(TreeNode p,int deep){
        if(p!=null){
            deep++;
            if(p.left==null&&p.right==null){
                if(deep>dept){
                    dept = deep;
                }
            }
            dfs(p.left,deep);
            dfs(p.right,deep);
        }
    }
}
