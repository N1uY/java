package SwordToOffer;

public class Day203 {
    int[] postOrder;
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length==0){
            return true;
        }
            postOrder = postorder;
            return helper(0,postorder.length-1);
    }
    boolean helper(int low,int high){
        if(low>high){
            return true;
        }
        else{
            int root = postOrder[high];
            int pos = high;
            for(int i=low;i<high;i++){
                if(postOrder[i]>root){
                    pos = i;
                    break;
                }
            }
            for(int j=pos;j<high;j++){
                if(postOrder[j]<root){
                    return false;
                }
            }
            return helper(low,pos-1)&&helper(pos,high-1);
        }
    }
}
