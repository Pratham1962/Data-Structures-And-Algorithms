/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;

        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b) -> a.val - b.val);

        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;

        for(ListNode node: lists){
            if(node!=null) pq.add(node);
        }

        while(!pq.isEmpty()){
            ListNode cur=pq.poll();
            ans.next=cur;
            ans=ans.next;
            if(cur.next!=null) pq.add(cur.next);
        }

        return dummy.next;
    }
}
