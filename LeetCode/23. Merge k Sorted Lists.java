import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode head:lists){
            if(head!=null)
                pq.add(head);
        }
        ListNode headAns=null;
        ListNode temp=null;
        while(!pq.isEmpty()){    
            ListNode top=pq.poll();
            if(headAns==null){
                headAns=top;
                temp=top;
            }
            else{
                temp.next=top;
                temp=temp.next;
            }
            if(top.next!=null)
                pq.add(top.next);
        }
        return headAns;
    }
}