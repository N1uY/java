package SwordToOffer;

public class Day182 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    public int dfs(TreeNode p){
        if(p!=null){
            int left = dfs(p.left);
            int right =  dfs(p.right);
            if(left-right>1||left-right<-1)
            {
                flag = false;
            }
            return Math.max(left,right)+1;

        }
        return 0;
    }
}
