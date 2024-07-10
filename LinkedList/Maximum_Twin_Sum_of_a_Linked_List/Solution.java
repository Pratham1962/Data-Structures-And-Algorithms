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

    public int pairSum(ListNode head) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        ListNode l1=head;
        int sum=0;
        int max=0;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode l2=reverseList(slow.next);

        while(l2!=null){
            sum=l2.val+l1.val;
            max=Math.max(sum,max);
            l2=l2.next;
            l1=l1.next;
        }

        return max;


    }
}
