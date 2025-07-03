import utils.ListNode;

import static LC0021.mergeSortedLL;

public class LC0148 {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head; // list is either singleton or empty => it is already sorted.
        }
        // split the list into left and right parts
        ListNode right = sortListHelper(head); // also de-links the two lists
        // sort left and right parts
        head = sortList(head);
        right = sortList(right);
        // merge the two sorted parts
        return mergeSortedLL(head, right);
    }
    public static ListNode sortListHelper(ListNode head) {
        ListNode slow = head, prev = head, fast = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null) prev.next = null;
        return slow;
    }
}
