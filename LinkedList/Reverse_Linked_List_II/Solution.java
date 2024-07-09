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
       
        ListNode newNode= null;
        while(head!=null){
            ListNode next=head.next;
            head.next=newNode;
            newNode=head;
            head=next;
        }

        return newNode;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev1=dummy;
        ListNode prev2=dummy;
        ListNode str1=prev1;
        ListNode str2=head;
        int i=0;

        while(i<left){

            str1=prev1;
            prev1=prev1.next;
            i++;
        }

        ListNode val=prev1;
        i=0;

        while(i<right){
            prev2=prev2.next;
            str2=str2.next;
            i++;
        }

        prev2.next=null;

        ListNode start= reverseList(prev1);

        str1.next=start;
        val.next=str2;

        return dummy.next;
