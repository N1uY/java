package SwordToOffer;

import java.util.*;

public class Day63 {
    public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>> rel = new ArrayList<>();
                Queue<TreeNode> queue = new LinkedList<>();

                int level = 1;
                TreeNode p = root;
                queue.add(p);
                while (!queue.isEmpty()) {
                    int length = queue.size();

                    List<Integer> r = new ArrayList<>();
                    while (length > 0) {
                        TreeNode t = queue.peek();
                        queue.remove(0);
                        if (t != null) {
                            r.add(t.val);
                            queue.add(t.left);
                            queue.add(t.right);
                        }
                        length--;
                    }
                    if (level % 2 == 0) {
                        Collections.reverse(r);
                    }
                    rel.add(r);
                    level++;


                }
                rel.remove(rel.size()-1);
            return  rel;
    }
}
