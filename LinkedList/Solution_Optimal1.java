
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
    public ListNode rotateRight(ListNode head, int k) {
       
        if(head==null || head.next==null) return head;

        int cnt=1;

        ListNode cur=head;

        //Step 1: find the length and make it a circular ll
        while(cur.next!=null){
            cnt++;
            cur=cur.next;
        }
       
        cur.next=head;

        //Step 2: Move till that element that is required
        k=k%cnt;
        k=cnt-k;

        while(k>0){
            cur=cur.next;
            k--;
        }

        //Step 3: Make changes
        head=cur.next;
        cur.next=null;

        return head;

    }
}

