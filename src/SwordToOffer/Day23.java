package SwordToOffer;

import java.util.HashMap;

//做过的题目 解决random指针的方法是hash
public class Day23 {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashMap = new HashMap<Node,Node>();
        Node p = head;
        while(p!=null){
            Node NewNode = new Node(p.val);
            hashMap.put(p,NewNode);
            p = p.next;
        }
        Node q = head;
        while(q!=null){
            hashMap.get(q).next = hashMap.get(q.next);
            hashMap.get(q).random = hashMap.get(q.random);
            q = q.next;
        }
        return hashMap.get(head);
    }
}
