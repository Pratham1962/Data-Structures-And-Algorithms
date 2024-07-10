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

    public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null){
            ListNode nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        ListNode l1=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode l2=reverseList(slow.next);

        while(l2!=null){
            if(l1.val!=l2.val) return false;
            l2=l2.next;
            l1=l1.next;
        }

        return true;
    }
}
