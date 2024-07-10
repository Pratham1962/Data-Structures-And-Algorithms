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
    public ListNode deleteDuplicates(ListNode head) {
       
        ListNode dummy=new ListNode(-200);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode cur=head;

        while(cur!=null && cur.next!=null){
           
            if(cur.next!=null && cur.next.val!=cur.val){
                cur=cur.next;
                prev=prev.next;
            }

            else{
                while(cur.next!=null && cur.next.val==cur.val){
                    cur=cur.next;
                }

                prev.next=cur.next;
                cur=cur.next;
            }
       
        }

        return dummy.next;
    }
}

