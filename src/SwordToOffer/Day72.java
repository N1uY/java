package SwordToOffer;

public class Day72 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root!=null){
            TreeNode left = mirrorTree(root.right);
            TreeNode right = mirrorTree(root.left);
            root.left = left;
            root.right = right;
        }
        return root;
    }
}
