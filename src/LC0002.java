import utils.ListNode;

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

public class LC0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l2 == null || l1 == null) return (l1 == null) ? l2 : l1;
        ListNode ptr1 = l1, ptr2 = l2;
        int carry = 0;
        ListNode head = null, prev = null;
        while (ptr1 != null && ptr2 != null) {
            int digit = ptr1.val + ptr2.val + carry;
            carry = digit / 10;
            digit = digit % 10;

            ListNode node = new ListNode(digit);

            if (prev == null) {
                head = node;
            } else {
                prev.next = node;
            }

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            prev = node;
        }

        if (ptr1 != null || ptr2 != null) {
            ptr1 = (ptr1 == null) ? ptr2 : ptr1;
            prev.next = ptr1;
            while (carry > 0 && ptr1 != null) {
                int digit = ptr1.val + 1;
                carry = digit / 10;
                digit = digit % 10;

                ptr1.val = digit;
                prev = ptr1;
                ptr1 = ptr1.next;
            }
        }

        if (carry == 1) {
            prev.next = new ListNode(1);
        }

        return head;
    }
}
