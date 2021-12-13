package Lc;

import java.util.ArrayList;
import java.util.List;

public class Hot94 {
    private  List<Integer> result = new ArrayList<>();

    void Inorder(TreeNode root) {
        if (root!=null) {
            Inorder(root.left);
            result.add(root.val);
            Inorder(root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
       Inorder(root);
        return result;

    }
}
