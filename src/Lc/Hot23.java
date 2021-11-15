package Lc;

public class Hot23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int emptyListNumber = 0;
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null){
                emptyListNumber++;
            }
        }
        ListNode hair = new ListNode();
        ListNode last = hair;
        while (emptyListNumber<lists.length-1){
            int smallestNumber = Integer.MAX_VALUE;
            int smallestIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i]==null){
                    continue;
                }
                if(lists[i].val<smallestNumber){
                    smallestNumber = lists[i].val;
                    smallestIndex = i;
                }
            }
            last.next = lists[smallestIndex];
            last = lists[smallestIndex];
            if(lists[smallestIndex]!=null){
                if(lists[smallestIndex].next==null) emptyListNumber++;
                lists[smallestIndex] = lists[smallestIndex].next;
            }
        }
        //merge the remain norEmpty list
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                last.next = lists[i];
            }
        }
        return hair.next;
    }
}
