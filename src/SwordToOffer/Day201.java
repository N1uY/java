package SwordToOffer;

import java.util.Arrays;
import java.util.HashSet;

public class Day201 {
    int[] pre;
    int[] in;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in = inorder;

        return helper(0,preorder.length-1,0,inorder.length-1);
    }
    public   TreeNode helper(int preLeft,int preRight,int inLeft,int inRight){
        if(preLeft>preRight&&inLeft>inRight){
//            TreeNode node = new TreeNode(preorder[0]);
//            return node;
            return null;
        }
        else{
            TreeNode root = new TreeNode(pre[preLeft]);
            int pos = -1;
            for(int i=inLeft;i<=inRight;i++){
                if(in[i]==pre[preLeft]){
                    pos = i;
                    break;
                }
            }
            int leftpos = preLeft;
            HashSet<Integer> set = new HashSet<>();
            for(int j=inLeft;j<pos;j++){
                set.add(in[j]);
            }
            for(int i=preLeft+1;i<=preRight;i++){
                if(set.contains(pre[i])){
                    leftpos = i;
                }else
                {
                    break;
                }

            }
            TreeNode left = helper(preLeft+1,leftpos,inLeft,pos-1);
            TreeNode right = helper(leftpos+1,preRight,pos+1,inRight);
            root.left = left;
            root.right = right;
            return root;
        }
    }
}
