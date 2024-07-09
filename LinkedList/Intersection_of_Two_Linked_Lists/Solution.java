/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        
        ListNode prev1=l1;
        ListNode prev2=l2;
        int cnt1=1;
        int cnt2=1;

        while(prev1!=null){
            prev1=prev1.next;
            cnt1++;
        }

        while(prev2!=null){
            prev2=prev2.next;
            cnt2++;
        }

        if(cnt1>cnt2){
            while(cnt1!=cnt2){
                l1=l1.next;
                cnt1--;
            }
        }

        else if(cnt1<cnt2){
            while(cnt1!=cnt2){
                l2=l2.next;
                cnt2--;
            }
        }

        while(l1!=null && l2!=null){
            if(l1==l2) return l1;
            l1=l1.next;
            l2=l2.next;
        }

        return null;



        
    }
}
