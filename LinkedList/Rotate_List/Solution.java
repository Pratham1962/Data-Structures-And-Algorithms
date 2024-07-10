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
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        k = k % length;
        if (k == 0) return head;

        ListNode reversedList = reverseList(head);

        ListNode dummy = new ListNode(0);
        dummy.next = reversedList;
        ListNode prev = dummy;
        for (int i = 0; i < k; i++) {
            prev = prev.next;
        }

        ListNode newHead = prev.next;
        prev.next = null;

        ListNode firstPart = reverseList(reversedList);
        ListNode secondPart = reverseList(newHead);

        temp = firstPart;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = secondPart;

        return firstPart;
    }
}
