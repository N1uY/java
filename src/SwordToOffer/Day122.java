package SwordToOffer;

public class Day122 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lengthA = 0;
            ListNode p = headA;
            while(p!=null){
                lengthA++;
                p = p.next;
            }
            int lengthB = 0;
            ListNode q = headB;
            while (q!=null){
                lengthB++;
                q = q.next;
            }
            if(lengthA>=lengthB){
                int tmp = lengthA-lengthB;
                for(int i=0;i<tmp;i++){
                    headA = headA.next;
                }
            }
            else{
                int tmp = lengthB-lengthA;
                for(int i=0;i<tmp;i++){
                    headB = headB.next;
                }
            }
            while (headA!=null&&headB!=null){
                if(headA==headB){
                    break;
                }
                headA = headA.next;
                headB = headB.next;
            }
            if(headA!=null&&headB!=null){
                return headA;
            }
            else {
                return  null;
            }
    }
}
