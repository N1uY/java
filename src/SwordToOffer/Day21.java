package SwordToOffer;


import java.util.ArrayList;



class Day21 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> rel = new ArrayList<Integer>();
        ListNode hair = new ListNode(0);
        hair.next = null;
        ListNode p = head;

        ListNode tmp;
        while(p!=null){
            tmp = p;
            p = p.next;
            tmp.next = hair.next;
            hair.next = tmp;
        }
        ListNode q = hair.next;
        while(q!=null){
            rel.add(q.val);
            q = q.next;
        }
        int[] result = new int[rel.size()];
        for(int i=0;i<rel.size();i++){
            result[i] = rel.get(i);
        }
        return result;
    }
}
