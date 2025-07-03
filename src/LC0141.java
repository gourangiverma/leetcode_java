import utils.ListNode;

public class LC0141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }
        return false;
    }

    // follow-up: find length of cyclic part
    public int CycleLength(ListNode head) {
        int count = 1;
        ListNode slow = head;
        ListNode fast = head;
        while(fast == slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = slow.next;
        while(slow != fast) {
            count++;
            slow = slow.next;
        }
        return count;
    }
}
