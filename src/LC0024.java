import utils.ListNode;

public class LC0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode returnVal = head.next;
        ListNode prev = null, ptr = head;
        while (ptr != null && ptr.next != null) {
            if (prev != null) prev.next = ptr.next;
            prev = ptr.next.next;
            ptr.next.next = ptr;
            ptr.next = prev;
            prev = ptr;
            ptr = ptr.next;
        }
        return returnVal;
    }
}
