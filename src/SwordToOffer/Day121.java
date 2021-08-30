package SwordToOffer;

public class Day121 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        else if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        ListNode start;
        ListNode p;
        ListNode q;
        ListNode last;
        if(l1.val<l2.val){
            start = l1;
            p = l1.next;
            q = l2;
            start.next = null;
            last=start;
        }
        else{
            start = l2;
            p = l2.next;
            q = l1;
            start.next = null;
            last = start;
        }

        while (p!=null && q!=null){
            if(p.val<=q.val){
                last.next = p;
                last = p;
                p = p.next;
                last.next = null;

            }
            else{
                last.next = q;
                last =q;
                q = q.next;
                last.next = null;
            }
        }
        if(p!=null){
            while(p!=null){
                last.next = p;
                last = p;
                p = p.next;
                last.next = null;
            }
        }
        if(q!=null){
            while (q!=null){
                last.next = q;
                last =q;
                q = q.next;
                last.next = null;
            }
        }
        return start;
    }
}
