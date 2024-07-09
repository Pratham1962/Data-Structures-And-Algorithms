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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode cur=head;

        while(cur!=null){
            if(cur.val!=val){
                prev.next=cur;
                prev=cur;
            }

            cur=cur.next;
        }

        prev.next=cur;

        return dummy.next;
    }
}
