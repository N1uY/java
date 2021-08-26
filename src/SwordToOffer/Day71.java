package SwordToOffer;

public class Day71 {
    static boolean helper(TreeNode a,TreeNode b){
        if(b!=null) {
            if (a == null) {
                return false;
            } else {
                return a.val == b.val && helper(a.left, b.left) && helper(a.right, b.right);
            }
        }
        else return true;
    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null){
            return  false;
        }
        if(A!=null){
            if(A.val==B.val){
                if(helper(A, B)) {
                    return true;
                }
                else {
                    return isSubStructure(A.left,B)||isSubStructure(A.right,B);
                }
            }
            else{
                return isSubStructure(A.left,B)||isSubStructure(A.right,B);
            }
        }
        return false;
    }
}
