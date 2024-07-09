class Solution {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev; // return the new head of the reversed list
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = reverseList(l1);
        ListNode cur2 = reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(cur1 != null || cur2 != null || carry != 0){
            int sum = carry;

            if(cur1 != null) {
                sum += cur1.val;
                cur1 = cur1.next;
            }

            if(cur2 != null) {
                sum += cur2.val;
                cur2 = cur2.next;
            }

            carry = sum / 10;
            sum %= 10;
            
            current.next = new ListNode(sum);
            current = current.next;
        }

        return reverseList(dummy.next); // reverse the resulting linked list
    }
}
