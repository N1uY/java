package SwordToOffer;

public class Day153 {
    int count = 0;
    int rel = 0;
    public int kthLargest(TreeNode root, int k) {
            dfs(root,k);
            return rel;
    }
    private void dfs(TreeNode p,int k){
        if(p!=null){
            dfs(p.right,k);

            if(count!=k){
                count++;
            }
            if(count==k){
                rel = p.val;
            }

            dfs(p.left,k);

        }
    }


}
