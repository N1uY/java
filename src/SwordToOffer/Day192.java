package SwordToOffer;

import java.util.ArrayList;

public class Day192 {
    //二叉树公共祖先，各自存起来？然后比较？  可行，但不是很优秀的解法
    ArrayList<TreeNode> path = new ArrayList<>();
    ArrayList<TreeNode> pPath = new ArrayList<>();
    ArrayList<TreeNode> qPath = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            pdfs(root,p);
            qdfs(root,q);
            TreeNode rel = new TreeNode();
            for(TreeNode n:pPath){
                for (TreeNode treeNode : qPath) {
                    if (treeNode == n) {
                        rel = n;
                        break;
                    }
                }
            }
            return  rel;

    }
    public void pdfs(TreeNode node,TreeNode target){
            if(node!=null){
                path.add(node);
                if(node==target){
                    pPath = (ArrayList<TreeNode>) path.clone();
                }
                pdfs(node.left,target);
                pdfs(node.right,target);
                path.remove(node);
            }
    }
    public void qdfs(TreeNode node,TreeNode target){
        if(node!=null){
            path.add(node);
            if(node==target){
                qPath = (ArrayList<TreeNode>) path.clone();
            }
            qdfs(node.left,target);
            qdfs(node.right,target);
            path.remove(node);
        }
    }
}
