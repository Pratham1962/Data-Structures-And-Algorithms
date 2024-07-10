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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=head;
        int cnt=0;

        while(prev!=null){
            prev=prev.next;
            cnt++;
        }

        prev=dummy;
        n=cnt-n;
        int i=0;

        while(i<n){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;


        return dummy.next;
    }
}
