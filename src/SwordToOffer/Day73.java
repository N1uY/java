package SwordToOffer;

public class Day73 {
    boolean helper(TreeNode p,TreeNode q){
        if(p!=null && q!=null){
            return p.val==q.val && helper(p.left,q.right) && helper(p.right,q.left);
        }
        else {
            return p==null && q==null;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return  true;
        }
        else{
            return helper(root.left,root.right);
        }
    }
}
