package SwordToOffer;

public class Day111 {
    public ListNode deleteNode(ListNode head, int val) {
            if(head==null){
                return null;
            }
            ListNode p = new ListNode(0);
            ListNode q=head;
            p.next = q;
            while (q!=null){
                if(q.val==val){
                    if(q!=head) {
                        p.next = q.next;
                    }
                    else {
                        return head.next;
                    }
                    q = q.next;
                    p = p.next;
                }

            }
            return head;
    }
}
