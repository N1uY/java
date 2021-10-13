package Lc;

public class Lc02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode rel = new ListNode(0);
        ListNode result = rel;
        while (p!=null && q!=null){
            int tmp;
            tmp = p.val+q.val+rel.val;
            if(tmp<10)
            {
                rel.val = tmp;
                if(p.next!=null || q.next!=null) {
                    rel.next = new ListNode(0);
                }
            }
            else
            {
                rel.next = new ListNode(1);
                rel.val = tmp%10;
            }
            rel = rel.next;
            p=p.next;
            q=q.next;
        }
        ListNode Continue;
        if(q!=null){
            Continue =q;
        }
        else if(p!=null)
        {
            Continue =p;
        }
        else{
            return result;
        }
        while(Continue!=null){
            int tmp;
            tmp = Continue.val+rel.val;
            if(tmp<10)
            {
                rel.val = tmp;
                if(Continue.next!=null) {
                    rel.next = new ListNode(0);
                }
            }
            else
            {
                rel.next = new ListNode(1);
                rel.val = tmp%10;
            }
            rel = rel.next;
            Continue=Continue.next;
        }



        return  result;
    }
}
